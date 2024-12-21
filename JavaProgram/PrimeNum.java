package JavaProgram;
import java.util.Scanner;
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       
		Scanner scan = new Scanner(System.in);

		   
		        System.out.print("Enter a number:");
		        int PrimeNum= scan.nextInt();
		        
		        if (PrimeNum <= 1) {
		            System.out.println(PrimeNum + " is not a prime number.");
		        } else if (PrimeNum == 2 || PrimeNum == 3 || PrimeNum == 5 || PrimeNum == 7) {
		            System.out.println(PrimeNum + " is a prime number.");
		        } else if (PrimeNum % 2 == 0 || PrimeNum % 3 == 0 || PrimeNum % 5 == 0 || PrimeNum % 7 == 0) {
		            System.out.println(PrimeNum + " is not a prime number.");
		        } else {
		            System.out.println(PrimeNum + " is a prime number.");
		        }

              }
		
	}
