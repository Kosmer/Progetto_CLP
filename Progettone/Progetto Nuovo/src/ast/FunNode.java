package ast;
import java.util.ArrayList;
import java.util.HashMap;

import evaluator.SimpLanlib;
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
			ST.insert(id, type, nesting, flabel) ;
			for (Node dec : declist)
  				errors.addAll(dec.checkSemantics(ST, nesting+1));
			
			for (Node stm : stmlist)
				errors.addAll(stm.checkSemantics(ST, nesting+1));
			
			if(exp!=null)
				errors.addAll(exp.checkSemantics(ST, nesting+1));
			ST.remove();
			
			flabel = SimpLanlib.freshFunLabel() ;
			
			ST.insert(id, type, nesting, flabel) ;
			
		}
		return errors ; // problemi con la generazione di codice!
	}
  
 	public Type typeCheck () {
		if (declist!=null) 
			for (Node dec:declist)
				dec.typeCheck();
		if (stmlist!=null) 
			for (Node stm:stmlist)
				stm.typeCheck();
		if(exp!=null) {
			Type exp_type = exp.typeCheck();
			if ( (exp.typeCheck().getClass()).equals(returntype.getClass())) {
    			if(exp_type instanceof BoolType) {
    				return new BoolType();
    			}
    			if(exp_type instanceof IntType) {
    				return new IntType();
    			}
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
/*	  
 * DA RIFARE
 * 
	    String declCode = "" ;
//	    String popDecl = "" ;
	    if (declist.size() != 0) {
	    		for (Node dec:declist){
	    			declCode = declCode + dec.codeGeneration();
//	    			popDecl = popDecl + "pop\n";
	    		}
 	    }

//	    String popParl="";
//	    for (Node dec:parlist) popParl+="pop\n";
	     
	    SimpLanlib.putCode(
	    			flabel + ":\n"
	    			+ "pushr RA \n"
	    			+ declCode
	    			+ body.codeGeneration()
//	    			+ "move A0 RV \n"
	    			+ "addi SP " + 	declist.size() + "\n"
	    			+ "popr RA \n"
	    			+ "addi SP " + 	parlist.size() + "\n"
	    			+ "pop \n"
	    			+ "store FP 0(FP) \n"
	    			+ "move FP AL \n"
	    			+ "subi AL 1 \n"
	    			+ "pop \n"
	    			+ "rsub RA \n" 
   		
	    		"lra\n"+ 				// inserimento return address
	    		declCode+ 				// inserimento dichiarazioni locali
	    		body.codeGeneration()+
	    		"srv\n"+ 				// pop del return value e memorizzazione in rv
	    		popDecl+				// rimuove lo spazio per le variabili locali
	    		"sra\n"+ 				// pop del return address e memorizzazione in $ra
	    		popParl+				// rimuove lo spazio dei parametri
	    		"pop\n" +				// cancella access link
	    		"sfp\n"+  				// memorizza in fp il valore del frame pointer precedente (che si trova sulla pila)
	    		"salfpm \n" +			// memorizza in al l'ambiente del chiamante (che si trova a fp -1)
	    		"lrv\n"+ 				// risultato della funzione sullo stack
	    		"lra\n"+
	    		"js\n"  				// salta a ra
	    		
	    		);
	    
		return "push "+ flabel +"\n";
		*/
	  return "";	
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
			//declstr+="   ";
			for (Node dec:declist)
			    declstr+=dec.toPrint("  "+s+"");
		}
		  
			
		if (stmlist!=null) {
			stmlstr+="   ";
			for (Node stm:stmlist)
			    stmlstr+=stm.toPrint(s+" ");
		//	stmlstr+="\n";
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
	  
	  //valore di ritorno non utilizzato

}  