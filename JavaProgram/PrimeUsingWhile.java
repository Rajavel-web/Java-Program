package JavaProgram;

import java.util.Scanner;

public class PrimeUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Num ");
		int num=scan.nextInt();
		int i=2;
		while(i<num-1) {
			if(num%i==0) {
			System.out.println("Not Prime");
			return;
		}
		i++;
		
	}
	System.out.println("Prime");
}
}

	
