package Oopsconcept;

public class Constructorprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //constructor = should have same name as class name(initialized the object) it is non written type
		//1.parameterized 2.default
		Constructorprg c = new Constructorprg();
		Constructorprg c1= new Constructorprg(10);
		Constructorprg c3= new Constructorprg(10,20);
		display();
		
		
	}
	public Constructorprg()
	{
		System.out.println("default constructor");
		
	}
	public Constructorprg (int a)
	{
		System.out.println(a);
	}
	public Constructorprg (int a , int b)
	{
		System.out.println(a+b);
	}
	public static void display()
	{
		System.out.println("dispay");
	}
	
	
	

}
