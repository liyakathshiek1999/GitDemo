package Assignment;

public class Duplicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,1,2,3,44,2,1};
		
		for(int i=0; i<=5; i++ ) {
			int count=0;
			for(int j=0; j<=5; j++) {
				if(array[i]==array[j]) {
					count++;
					}
			}
				if (count>1) {
					System.out.println(array[i]);
								
			}				
			
		}		
		
	}	

}


