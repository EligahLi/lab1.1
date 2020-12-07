package bsu.rfe.java.group9.lab1.Lipskiy.var14;

public abstract class Food implements Consumable {
	
	String name = null;
	
	public Food(String name) {
		this.name = name; 
	}
	
	public boolean equals(Object arg0) {
		if (!(arg0 instanceof Food)) return false; // иру 1
		if (name==null || ((Food)arg0).name==null) return false; // иру 2
			return name.equals(((Food)arg0).name); // иру 3
	}
	
	public String toString() {
		return name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}