package Assignment;

import java.util.Scanner;

public class Notavailablenum {

	public static void main(String[] args) {
	 //Q.write a program that reads an integer is not b/t 1 & 10
				Scanner s = new Scanner(System.in);
				int n=s.nextInt() ;
				while (n<1 || n>10){
					{
					System.out.print(n+ " "+ "is not between 1 and 10.try again");
					n= s.nextInt();
					
				}
				System.out.println(n+"is between 1 & 10");
				}
	}

	
	
	
	
}
		
			
				

	


