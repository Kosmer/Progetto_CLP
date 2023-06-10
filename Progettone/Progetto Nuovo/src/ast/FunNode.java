package ast;
import java.util.ArrayList;
import java.util.HashMap;

import evaluator.SimpLanPluslib;
import semanticAnalysis.STentry;
import semanticAnalysis.SemanticError;
import semanticAnalysis.SymbolTable;

public class FunNode implements Node {
	private String id;
	private Type returntype ; 
	private ArrayList<ParNode> parlist ; 
	private ArrayList<Node> declist ; 
	private ArrayList<Node> stmlist ; 
	private Node exp;
	private ArrowType type ;
	private int nesting ;
	private String flabel ;
	private SymbolTable s;
  
	public FunNode (String _id, Type _type, ArrayList<ParNode> _parlist, ArrayList<Node> _declist, ArrayList<Node> _stmlist, Node _exp) {
		id = _id ;
		returntype = _type;
		parlist = _parlist ;
		declist = _declist ;
		stmlist = _stmlist;
		exp = _exp;
		
	}

	public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {
		
		ArrayList<SemanticError> errors = new ArrayList<SemanticError>();
		nesting = _nesting ;
		
		if (ST.lookup(id) != null)
			errors.add(new SemanticError("Function Identifier " + id + " already declared"));
		else {
			HashMap<String,STentry> HM = new HashMap<String,STentry>() ;
			ArrayList<Type> partypes = new ArrayList<Type>() ;
		
			ST.add(HM);
			//ST.addCopyEnv();
			
			
			System.out.println("Sto dichiarando " + id +", Tabella: " + ST.toPrint());
			
			for (ParNode arg : parlist){
    	  			partypes.add(arg.getType());
    	  			if (ST.top_lookup(arg.getId()))
    	  					errors.add(new SemanticError("Parameter id " + arg.getId() + " already declared")) ;
    	  			else {
    	  				ST.insert(arg.getId(), arg.getType(), nesting+1, "", true) ;
    
    	  			}
    	  		}

			type = new ArrowType(partypes, returntype) ;
			
			ST.increaseoffset() ; // aumentiamo di 1 l'offset per far posto al return value
			
			
			for (Node dec : declist)
			{
				errors.addAll(dec.checkSemantics(ST, nesting+1));
			}
  				
			
			flabel = SimpLanPluslib.freshFunLabel() ;
			ST.insert(id, type, nesting, flabel) ;
			STentry T = ST.lookup(id);
			T.setInitialized();
			
			for (Node stm : stmlist)
				errors.addAll(stm.checkSemantics(ST, nesting+1));
			
			System.out.println("TABELLA A META" + ST.toPrint());

			if(exp!=null)
				errors.addAll(exp.checkSemantics(ST, nesting+1));
			
			
			
			ST.remove();
			
			
			
			ST.insert(id, type, nesting, flabel) ;
			T = ST.lookup(id);
			T.setInitialized();
			
		}
		return errors ;
	}
  
 	public Type typeCheck () {
		if (declist!=null) 
			for (Node dec:declist){
				Node dec2 = dec.typeCheck();
				if (dec2 instanceof ErrorType)
					return new ErrorType();
			}
				
		if (stmlist!=null) 
			for (Node stm:stmlist) {
				Node stm2 = stm.typeCheck();
				if (stm2 instanceof ErrorType)
					return new ErrorType();
			}
				
		if(exp!=null) {
		
			Type exp_type = exp.typeCheck();
			
				if ( (exp.typeCheck().getClass()).equals(returntype.getClass())) {
					return exp_type;
				}
				
		}
		if(returntype instanceof VoidType && exp==null) {
			return new VoidType();
		}
		else {
			System.out.println("Wrong return type for function "+id);
			return new ErrorType() ;
		}  
  	}
  

  public String codeGeneration() {
	  	String declCode = "" ;
	    if (declist.size() != 0) {
	    		for (Node dec:declist){
	    			declCode = declCode + dec.codeGeneration();

	    		}
	    }
	    
	  String stmlCode = "" ;
	    if (stmlist.size() != 0) {
	    		for (Node stm:stmlist){
	    			stmlCode = stmlCode + stm.codeGeneration();

	    		}
	    }
	  
	    String expCode="";
	    if(exp!=null)
	    	expCode+=exp.codeGeneration();

	    
	    
	    SimpLanPluslib.putCode(
	    			flabel + ":\n"
	    			+ "pushr RA \n"
					//+"INIZIO CODICE DENTRO FUNNODE\n"
	    			+ declCode
	    			+ stmlCode
	    			+ expCode
	    			//+"FINE CODICE DENTRO FUNNODE\n"
	    			+ "addi SP " + 	declist.size() + "\n"
	    			+ "popr RA \n"
	    			+ "addi SP " + 	parlist.size() + "\n"
	    			+ "pop \n"
	    			+ "store FP 0(FP) \n"
	    			+ "move FP AL \n"
	   				+ "subi AL 1 \n"
	   				+ "pop \n"	
					+ "rsub RA \n" 
					//+"FINE FUNNODE\n"
	    		);
	    
	    System.out.println("LABELLA: "+flabel);
	    System.out.println("CODICE: "+SimpLanPluslib.getCode());
		return 	//"FUNCTIONDECLARATION\n"+
				/*"storei T1 1 \n" +
				"sub SP T1 \n" +
				"popr SP \n" +*/
				//"subi SP 1 \n"+
				"push " + flabel +"\n";	
  }
  
  
  
  
  
  public String toPrint(String s) {
	  
		String parlstr="   ";
		for (Node par:parlist){
		  parlstr += par.toPrint(s);
		}
		if (parlstr=="   ")
			parlstr="";
		String declstr= "";
		String stmlstr= "";
		String explstr="";
		if (declist!=null) {
			
			for (Node dec:declist)
			    declstr+=dec.toPrint("  "+s+"");
		}
		  
			
		if (stmlist!=null) {
			stmlstr+="   ";
			for (Node stm:stmlist)
			    stmlstr+=stm.toPrint(s+" ");
		
		}
			  
		if (exp!=null) {
				explstr+="   ";
				explstr+=exp.toPrint(s+" ");
		}
	    return s+"Fun:" + id +"\n"
			   +type.toPrint(s+"  ")
			   +parlstr 
		   	   + "\n" 
		   	   +declstr
		   	   +stmlstr
		   	   +explstr; 
	  }
	  
	  

}  