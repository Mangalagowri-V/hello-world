class fruits{
	
	  String name = "Apple";
	  
	public void family()
	{
	
	System.out.println("Fruit Family");
	}
}

public class Inheritance extends fruits {
	
		private String color ="Red";
				
	public static void main(String[] args) {

		Inheritance in = new Inheritance();
		//in.family();
		System.out.println(in.name + " is "+in.color);
	}

}
