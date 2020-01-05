 class over1
{
	public void print()
	{
		System.out.println("nnnnnnnnn");
	}
}
 
 class over2 extends over1
 {
	 public void print()
	 {
		 System.out.println("kkkkkkkkkkkk");
	 }
 }
public class Overriding {

	public static void main(String[] args) {
		
		over1 o1 = new over1();
		over1 o2 = new over2();
		
		o1.print();
		o2.print();		

	}

}
