package semanticAnalysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import ast.BoolType;
import ast.IntType;
import ast.Type;
import semanticAnalysis.STentry;

public class SymbolTable {

	private ArrayList<HashMap<String,STentry>>  symbol_table ;
	private ArrayList<Integer> offset;
	
	public SymbolTable() {
		symbol_table = new ArrayList<HashMap<String,STentry>>() ;
		offset = new ArrayList<Integer>() ;
	}
	
	public Integer nesting() {
		return symbol_table.size() -1 ;
	}
	
	/*
	public SymbolTable copy() {
		SymbolTable S = new SymbolTable() ;
		for (HashMap h:symbol_table) {
			S.add(h);
		}
		return S;
	}
	*/
	
	//torna una copia della SymbolTable
	public SymbolTable copy() {
	    SymbolTable newSymbolTable = new SymbolTable();
	    ArrayList<HashMap<String,STentry>>  st = new ArrayList<HashMap<String,STentry>>() ;
		ArrayList<Integer> o =  new ArrayList<Integer>() ;
		
	    for (HashMap<String, STentry> hashMap : symbol_table) {
	        HashMap<String, STentry> newHashMap = new HashMap<>();
	        for (String key : hashMap.keySet()) {
	        	STentry oldSTEntry = hashMap.get(key);
	        	STentry newSTEntry = new STentry(oldSTEntry.gettype(), oldSTEntry.getoffset(), oldSTEntry.getnesting());
	            newSTEntry.setLabel(oldSTEntry.getlabel());
	            newSTEntry.setinitialized(oldSTEntry.getInitialized());
	        	newHashMap.put(key, newSTEntry);
	        }
	        st.add(newHashMap);
	    }
	    
	    for (int i : offset) {
	    	o.add(i);
	    }
	    
	    newSymbolTable.setAll(st, o);
	    
	    return newSymbolTable;
	}
	
	public String toPrint(){
        String res="";
            for (HashMap<String, STentry> hashMap : symbol_table) {

                for (String key : hashMap.keySet()) {
                    STentry e = hashMap.get(key);
                    res+="Entry ID: "+key+"\n";
                    res+="\tTipo: "+e.gettype().getClass().getSimpleName()+"\n";
                    res+="\tOffset: "+e.getoffset()+"\n";
                    res+="\tNesting: "+e.getnesting()+"\n";
                    res+="\tLabel: "+e.getlabel()+"\n";
                    res+="\tInitialized: "+e.getInitialized()+"\n";
                }
            }

            return res;
    }
	//public SymbolTable newScope(SymbolTable st) {}
	
	public void add(HashMap<String,STentry> H) {
		symbol_table.add(H) ;
		offset.add(1) ;		// si inizia da 2 perche` prima ci sonop FP e AL
	}
	
	
	public void insert(String id, Type type, int _nesting, String _label) {
		int n = symbol_table.size() - 1 ;
		HashMap<String,STentry> H = symbol_table.get(n) ;
		symbol_table.remove(n) ;
		int offs = offset.get(n) ;
		offset.remove(n) ;
		STentry idtype = new STentry(type,offs,_nesting, _label) ;
		H.put(id,idtype) ;
		symbol_table.add(H) ;
		if (type.getClass().equals((new BoolType()).getClass()))
			offs = offs + 1 ; // we always increment the offset by 1 otherwise we need ad-hoc
							  // bytecode operations
		else if (type.getClass().equals((new IntType()).getClass()))
			offs = offs + 1 ;
		else offs = offs + 1 ;
		offset.add(offs) ;	
	}
	
	public void insert(String id, Type type, int _nesting, String _label, boolean init) {
		int n = symbol_table.size() - 1 ;
		HashMap<String,STentry> H = symbol_table.get(n) ;
		symbol_table.remove(n) ;
		int offs = offset.get(n) ;
		offset.remove(n) ;
		STentry idtype = new STentry(type,offs,_nesting, _label, init) ;
		H.put(id,idtype) ;
		symbol_table.add(H) ;
		if (type.getClass().equals((new BoolType()).getClass()))
			offs = offs + 1 ; // we always increment the offset by 1 otherwise we need ad-hoc
							  // bytecode operations
		else if (type.getClass().equals((new IntType()).getClass()))
			offs = offs + 1 ;
		else offs = offs + 1 ;
		offset.add(offs) ;	
	}
	
	public STentry lookup(String id) {
		int n = symbol_table.size() - 1 ;
		boolean found = false ;
		STentry T = null ;
		while ((n >= 0) && !found) {
			HashMap<String,STentry> H = symbol_table.get(n) ;
			T = H.get(id) ;
			if (T != null) found = true ;
			else n = n-1 ;
		}
		return T ;
	}
	
	public boolean top_lookup(String id) {
		int n = symbol_table.size() - 1 ;
		STentry T = null ;
		HashMap<String,STentry> H = symbol_table.get(n) ;
		T = H.get(id) ;
		return (T != null) ;
	}
	
	public void remove() {
		int x = symbol_table.size() ;
		symbol_table.remove(x-1) ;
		offset.remove(x-1) ;
	}
	
	public void setAll(ArrayList<HashMap<String,STentry>>  st , ArrayList<Integer> o) {
		symbol_table = st;
		offset = o;
	} 
	
	public ArrayList<HashMap<String,STentry>> getSymbolTable(){
		return symbol_table;
	}
	
	public void increaseoffset() {
		int n = offset.size() - 1 ;
		int offs = offset.get(n) ;
		offset.remove(n) ;
		offs = offs + 1 ;
		offset.add(offs) ;	
	}
}
