package Oopsconcept;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is starting program");
		try { 	
			
		//int a=10/0;
			String str=null;
			System.out.println(str.length());
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
		
		System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutofBounds Expension occurs");
			
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("ending the program");

	}
}	