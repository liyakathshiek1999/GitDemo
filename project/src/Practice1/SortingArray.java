package Practice1;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		int a[]= {25,26,458,235,15,17,36,21,35,4,3,1,89,2,};
		Arrays.sort(a);
		System.out.println("sorting array values");
		for (int i=0; i<a.length; i++) {
			
		
		System.out.println(a[i]);
		}
		System.out.println("------------------");
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				int temp=0;
				if (a[i]>a[j])
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
