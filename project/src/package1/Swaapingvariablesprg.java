package package1;

public class Swaapingvariablesprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20;
	      //System.out.println("a value =" +a+"b value ="+b );
			/*
			 * int temp=a; a=b; b=temp; System.out.println("a value= "+a+ "b value ="+b);
			 */	
	      a=a+b; //10+20=30
	      b=a-b; //30-20=10
	      a=a-b; //30-10=20
	      System.out.println("a value =" +a+ "b value =" +b);
	      
	      

	}

}
