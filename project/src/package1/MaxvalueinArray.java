package package1;

import java.util.Arrays;

public class MaxvalueinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,4,8,3,1,16,98,54};
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{			
		if(a[i]>max)
			max=a[i];
		}
		System.out.println(max);
		
		int a1[] = {8,10,22,456,985,3388};
		Arrays.sort(a1);
		System.out.println("a largest value" +a1[a1.length-1]);
		
			
		
		
	}
	}


