package Assignment;

public class Sumofnumbersprg {

	public static void main(String[] args) {
	       int number = 178;
	       String numstr = Integer.toString(number);
	       int length= numstr.length();
	       int sum=0;
	       for(int i=1 ; i<=length ; i++) 
	       {
	    	 int remain= number%10;
	    	 sum=sum+remain;
	    	 
	    	 }
	       System.out.println("sum "+sum+" length "+length);
		}

}


