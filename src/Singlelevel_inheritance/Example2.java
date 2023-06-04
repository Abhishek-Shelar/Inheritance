package Singlelevel_inheritance;

public class Example2 extends Example1
{
	public void Bike() 
	{
		System.out.println("Bike:FZ");
		
	}
public static void main(String[] args) {
	Example2 A=new Example2();
	A.Bike();
	
	
	System.out.println("----------------------------------------------------------------------------------------");
	System.out.println("taken from example1");
	A.Car();
	A.Gold();
	A.Home();
	A.money();
}
}
