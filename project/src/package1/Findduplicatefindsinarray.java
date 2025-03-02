package package1;

public class Findduplicatefindsinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int a[] = {1, 1, 1, 2, 3, 4, 5, 5, 56};

	        System.out.println("Array length: " + a.length);

	        System.out.print("Duplicate numbers: ");
	        
	        for (int i = 0; i < a.length; i++) {
	            for (int j = i + 1; j < a.length; j++) {
	                if (a[i] == a[j]) {
	                    System.out.print(a[i] + " ");
	                    // Break out of the inner loop after finding a duplicate
	                    break;
	                }
	            }
	        }
	    }
}