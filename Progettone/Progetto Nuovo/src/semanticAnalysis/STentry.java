package semanticAnalysis;

import ast.Type;

public class STentry {
	private Type type ;
	private int offset ;
	private int nesting ;
	private String label;
	private boolean initialized;

	
	public STentry(Type _type, int _offset, int _nesting) {
		type = _type ;
		offset = _offset ;
		nesting = _nesting ;
		initialized = false;
		label="";
	}
	
	public STentry(Type _type, int _offset, int _nesting, String  _label, boolean init) {
		type = _type ;
		offset = _offset ;
		nesting = _nesting ;
		initialized = init;
		label="";
	}
	
	public STentry(Type _type, int _offset, int _nesting, String  _label) {
		type = _type ;
		offset = _offset ;
		nesting = _nesting ;
		label = _label ;
		initialized = false;
	}
	
	public Type gettype() {
		return type ;
	}

	public int getoffset() {
		return offset ;
	}
	
	public int getnesting() {
		return nesting ;
	}
	
	public String getlabel() {
		return label ;
	}
	
	public boolean isInitialized() {
		return initialized;
	}
	
	public void setInitialized() {
		initialized = true;
	}
	
	public void setinitialized(boolean i) {
		initialized = i;
	}
	
	public boolean getInitialized() {
		return initialized;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public void setNesting(int nesting) {
		this.nesting = nesting;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	

}
