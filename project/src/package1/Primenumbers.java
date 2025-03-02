package package1;

import java.util.Scanner;

public class Primenumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("enter a range of prime numbers");
		int n= scanner.nextInt();
		for(int i=2;i<=n;i++) {
			int count = 0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+"\t");
			}
		}
	}
}




