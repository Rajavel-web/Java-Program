package JavaProgram;

import java.util.Scanner;

public class AddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		
		System.out.println("Please Enter Your Number");
		int num=Scan.nextInt();
		if(num%2==0) {
			System.out.println("Number is Even :"+num);
		}
		else {
			System.out.println("Number is Add :"+num);
		}
		

	}

}
