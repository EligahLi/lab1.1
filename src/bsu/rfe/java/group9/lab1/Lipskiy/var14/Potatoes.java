package bsu.rfe.java.group9.lab1.Lipskiy.var14;


public class Potatoes extends Food  {
	private String type;
	
	public Potatoes(String type) {
		super("Potatoes");
		this.type = type;
	}
		
	public void consume() {
		System.out.println(this + " съедено ");
	}
	
	public String getType() {
		return type;
	}
	

	public void setType(String type) {
		this.type = type;
	}
	int potatoes=0;
	
	public boolean equals(Object arg0) {
		if (super.equals(arg0)) {
			if (!(arg0 instanceof Potatoes)) return false;
			return type.equals(((Potatoes)arg0).type);
		}
		else
			return false;
	}

	public String toString() {
		return super.toString() + " типа '" + type.toUpperCase() + "'";
		}
	}