package Oopsconcept;

public class Overloadingprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//polimorphizm= a single action by different way
		//1.compile time polimorphizm = overloading : a same method with different parameters/with in class
		//2.run time                  =overriding   : same parameters used in different class
		
		Overloadingprg N = new Overloadingprg();
		N.add(10);
	    N.add(20, 40);
	    N.add("affu","chanu");
	    N.add(10, "nayyum");
		
		
		
	}
	public void add (int a)
	{
	System.out.println(a);
	
	}
	public void add (int a ,int b)
	{
	System.out.println(a+b);
	}
	public void add (String a ,String b)
	{
	System.out.println(a+b);
	}
	public void add (int t ,String b)
	{
	System.out.println(t+b);
	}

}







