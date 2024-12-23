package JavaProgram;

public class SumOfEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evenSum = 0;
        int oddSum = 0;
        int number = 0;

        
        while (number <= 20) {//1+3+5 //2+4
            if (number % 2 == 0) {
                evenSum += number; 
            } else {
                oddSum += number; 
            }
            number++; 
        }

        
        System.out.println("Sum of even numbers between 0 to 20: " + evenSum);
        System.out.println("Sum of odd numbers between 0 to 20: " + oddSum);
    }
}



