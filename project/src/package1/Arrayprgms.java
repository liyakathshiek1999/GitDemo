package package1;

public class Arrayprgms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		System.out.println(a.length);
		for(int i=0; i<=a.length; i++)
		System.out.println(a[i]);
		String str[] = {"afroz" ,"affu" ,"banu"};
		for(int i=0; i<str.length;i++)
		System.out.println(str[i]);
		System.out.println("--------------------");
		System.out.println("a[2]" +a[2]);
		//two dimensional array
		int [][] arr =new int [2][2];
		arr[0][0]=23;
		arr[0][1]=22;
		arr[1][0]=35;
		arr[1][1]=78;
		for(int i=0; i <arr.length; i++) {
			for( int j=0;  j< arr.length;  j++) {
				System.out.println(arr[i][j]  +" ");
				System.out.println();
				
			}
			
			
		}
			
		
		
		
	}

}
