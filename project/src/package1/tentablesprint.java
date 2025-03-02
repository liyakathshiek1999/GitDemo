package package1;

import java.util.Scanner;

public class tentablesprint {

	public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
      System.out.println("Enter how many table doyou want");
      int n=scan .nextInt();
      int a=10;
      for(int i=1; i<=n; i++)
      {
    	  System.out.println(i+ "Table/n" + "---------------");
    	  for(int j=1; j<=n; j++)
    	  {
    		  System.out.println(i+" * " +j+ " = "+(j*i));
    	  }
    	  System.out.println("------------");
    	  
    		  
      }
    	  
    	  
      }
      
  }	



