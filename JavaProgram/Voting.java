package JavaProgram;

import java.util.Scanner;
public class Voting {
	

	    public static void main(String[] args) {
	    	// TODO Auto-generated method stub
	    	
	    	   Scanner scanner = new Scanner(System.in);
	    	   
	    	   System.out.print("Enter your nationality: ");
   	          String nationality = scanner.nextLine().trim();
   	       System.out.print("Enter your age: ");
	        int age = scanner.nextInt();

	        
	        if (nationality.equalsIgnoreCase("Indian")) {
	            if (age >= 18) {
	                System.out.println("You are eligible to vote.");
	            } else {
	                System.out.println(" You must be least 18 years old");
	            }
	        } else {
	            System.out.println("You are not eligible to vote");
	        }

	        scanner.close();
	    }
	}


	    	       
	    	        

	    	       
	    	        