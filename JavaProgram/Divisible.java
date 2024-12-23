package JavaProgram;
import java.util.Scanner;

public class Divisible {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
			System.out.println("enter the number to check it is divisible by 2 and 4");
			int num = sc.nextInt();
			int orginalnum=num;
			boolean b=false;
			while(num > 2) {
				if(num % 2 == 0 && num % 4 == 0) {
				b=true;
				break;
				}
				num /=10;
			}
			if(b) {
				System.out.println(orginalnum+" Divisible");
			}
			else {
				System.out.println(orginalnum+" Not Divisible");
			}
			sc.close();
}
}
