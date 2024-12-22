package JavaProgram;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=scan.nextInt();
		System.out.println("Enter the second number");
		
		int num2=scan.nextInt();
        System.out.println("Enter the third number");
		
		int num3=scan.nextInt();
		if (num1 < num2 && num1 < num3) {
			System.out.println("first number is smallest");
		} else if (num2 < num3) {
			System.out.println("second number is smallest");

		} else {
			System.out.println("third number is smallest");

		}

	}

}
