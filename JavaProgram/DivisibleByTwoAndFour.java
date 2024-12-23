package JavaProgram;

import java.util.Scanner;

public class DivisibleByTwoAndFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scan.nextInt();
		while(num>0) {
			if(num%2==0&& num%4==0) {
				System.out.println(num+" Divisible");
			}
			else {
				System.out.println(num+" Not Divisible");
			}
			break;
		}

	}

}
