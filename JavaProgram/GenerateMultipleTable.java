package JavaProgram;

import java.util.Scanner;

public class GenerateMultipleTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter Your number");
		int num=scan.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}

	}

}
