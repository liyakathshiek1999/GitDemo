package package1;

import java.util.Arrays;

public class Sortingarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,4,8,3,1,16,98,54};// 1,2,3,16,54,98-output
		
		  Arrays.sort(a); 
		  System.out.println("sorting of a values"); 
		  for (int i=0; i<a.length; i++)
		  { 
			  System.out.println(a[i]); }
		 
		//assending order
			System.out.println("------------");
			for(int i=0; i<a.length; i++)
			{
				for(int j=i+1; j<a.length; j++)
				{
					int temp=0;
					if(a[i]>a[j])
					
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
					
					}
						System.out.println(a[i]);
			
				}
			//decending order
			
	System.out.println("-----------");

	for(int i=0; i<a.length; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			int temp=0;
			if(a[i]<a[j])
			
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
			}
				System.out.println(a[i]);
	
		}
	}
}

 				
	
		
		

	


