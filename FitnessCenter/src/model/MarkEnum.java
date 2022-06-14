package model;

public enum MarkEnum {

	A(1), B(2), C(3), D(4), E(5);
	
	private int numVal;
	
	MarkEnum(int numVal){
		this.numVal = numVal;
	}
	
	public int getNumVal() {
		return numVal;
	}
}
