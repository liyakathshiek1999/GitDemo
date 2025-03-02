package package1;

public class Fibonancciprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upto 10 fibonacci series
		int n1=0, n2=1, n3,fib=10;
		System.out.println(n1+ "" +n2);
		for(int i=2; i<fib; i++)
		{
			n3=n1+n2;
			System.out.println("" +n3);
			n1=n2;
			n2=n3;
			
		}

	}

}
