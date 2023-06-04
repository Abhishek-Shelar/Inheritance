package multilevel_inheritace;

public class Example4 extends Example3
{

	//Multilevel inheritance
	public void Gold()
	{
System.out.println("Gold:2KG");		
	}
	public static void main(String[] args) {
		Example4 A=new Example4();
		A.Gold();
		A.Money();
		A.Car();
		A.Home();
	}
}
