package bsu.rfe.java.group9.lab1.Lipskiy.var14;

	public class Apple extends Food {
		private String size;
		public Apple(String size) {
		super("Apple");
		this.size = size;
		}
		public void consume() {
		System.out.println(this + " съедено");
		}
		public String getSize() {
		return size;
		}
		public void setSize(String size) {
		this.size = size;
		}
		// Переопределѐнная версия метода equals(), которая при сравнении
		// учитывает не только поле name (Шаг 1), но и проверяет совместимость
		// типов (Шаг 2) и совпадение размеров (Шаг 3)
		public boolean equals(Object arg0) {
		if (super.equals(arg0)) { // Шаг 1
		if (!(arg0 instanceof Apple)) return false; // Шаг 2
		return size.equals(((Apple)arg0).size); // Шаг 3
		} else
		return false;
		}
		public String toString() {
		return super.toString() + " размера '" + size.toUpperCase() + "'";
		}
		}