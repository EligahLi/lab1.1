package bsu.rfe.java.group9.lab1.Lipskiy.var14;

public class MainApplication {
	@SuppressWarnings("unchecked")
	

	public static void main(String[] args) throws Exception {
		Food[] breakfast = new Food[20];
		int itemsSoFar = 0;

		for (String arg: args) {
			String[] parts = arg.split("/");
			if (parts[0].equals("Cheese")) {
				breakfast[itemsSoFar] = new Cheese();	
			} else
				if (parts[0].equals("Apple")) {
					breakfast[itemsSoFar] = new Apple(parts[1]);
				} else
					if (parts[0].equals("Potatoes")) {
						breakfast[itemsSoFar] = new Potatoes(parts[1]);
					}
			itemsSoFar++;
		} 
		
		System.out.println("Consumed: ");
		for (Food item: breakfast)
		if (item!=null)
		item.consume();
		else
		break;
	
		System.out.println("Завтрак:");
		
//report all eaten types/names and their quantity (final list)		
		String temp="", tempFinal="";
		for(int i=0;i<breakfast.length;i++) {
			if(breakfast[i]==null)
				continue;
			int counter=0;
			for (Food item: breakfast) if (item!=null && item.equals(breakfast[i])) counter++;  //count number of items matching current one
			
			temp=breakfast[i].toString() + " " + counter+ " шт.";
            if(tempFinal.indexOf(temp)<0) tempFinal=tempFinal+temp+"\n";
		}
 
		System.out.println(tempFinal+"Всего хорошего!");
	}
	
	
}