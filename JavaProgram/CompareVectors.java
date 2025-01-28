package TechTest270725;
import java.util.Vector;

public class CompareVectors {

	    public static void main(String[] args) {
	        // Create the first Vector
	        Vector<String> vector = new Vector<>();
	        vector.add("Ajith");
	        vector.add("Vijay");
	        vector.add("Vikram");

	        // Create the second Vector
	        Vector<String> vector2 = new Vector<>();
	        vector2.add("Ajith");
	        vector2.add("Vijay");
	        vector2.add("Vikram");

	        // Create a third Vector with different elements
	        Vector<String> vector3 = new Vector<>();
	        vector3.add("Ajith");
	        vector3.add("Vijay");
	        
	        System.out.println("Comparing vector vector to vector2: " + vector.equals(vector2));
			System.out.println("Comparing vector v2 to vector3: " + vector2.equals(vector3));
	       
	    }
}