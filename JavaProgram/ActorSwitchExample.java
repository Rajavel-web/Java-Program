package JavaProgram;

import java.util.Scanner;

public class ActorSwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter The Name of Actors Ajith Vijay Simbu");
		
		String actor=scan.nextLine();
		switch (actor.toLowerCase()) {
		case "ajith":
			System.out.println("Vida Muyarchi");
			System.out.println("Thunivu");
			System.out.println("Mangatha");
			break;
			
		case "vijay":
			System.out.println("Gilli");
			System.out.println("Varisu");
			System.out.println("Kaththi");
			break;
		case "simbu":
			System.out.println("Pathu Thala");
			System.out.println("Vanam");
			System.out.println("Eshwaran");
			System.out.println("Manmathan");
			break;
			default:
				System.out.println("Please Enter the name  Ajith Vijay Simbu");
				break;
			
		
		}
		scan.close();
		

	}

}
