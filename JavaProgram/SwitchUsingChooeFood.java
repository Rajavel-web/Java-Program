package JavaProgram;

import java.util.Scanner;

public class SwitchUsingChooeFood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Choose the Food Veg or Non-Veg");
		String food=scan.nextLine();
		food=food.toLowerCase();
		switch(food) {
		case "veg":
			System.out.println("Veg Full Meals");
			
			System.out.println("Sambar Rice");
			
			System.out.println("Curd Rice");

			System.out.println("Veg Fried Rice");

			System.out.println("Veg Noodels");

			System.out.println("Paneer Tikka");
             break;
		case "non veg":
			System.out.println("Chikkan Biriyani");
			
			System.out.println("Chikkan Fired Rice");
			
			System.out.println("Chikkan Noodels");
			
			System.out.println("Shawarma");
			
			break;
			default:
				System.out.println("Choose the valid Food either veg or non-veg only");

			
		}

	}

}
