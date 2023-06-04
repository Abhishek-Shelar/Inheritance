package Hiracle_inheritace;

public class Example2 extends Example1
{
	public void bike()
	{
	System.out.println("bike:R15");	
	}
public static void main(String[] args) 
{
Example2 A=new Example2();
A.bike();
A.car();
A.Home();
A.Money();
}
}
