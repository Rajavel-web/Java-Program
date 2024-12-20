package JavaProgram;
import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;


public class CalendarUsingDateYear {
	
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a date (yyyy-MM-dd):");
	        String inputDate = scanner.nextLine();

	        try {
	            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	            Calendar calendar = Calendar.getInstance();
	            calendar.setTime(sdf.parse(inputDate));

	            calendar.add(Calendar.YEAR, 4);
                String newDate = sdf.format(calendar.getTime());

	            System.out.println("The date after 4 year: " + newDate);

	        } catch (Exception e) {
	            System.out.println("invalid date please enter this format yyyy-MM-dd ");
	        }

	        scanner.close();
	    }
	}



