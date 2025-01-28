package TechTest270725;
import java.util.Vector;

public class AddVectorToAnotherVector{
	    public static void main(String[] args) {
	        // Create the first Vector
	        Vector<String> vector = new Vector<>();
	        vector.add("java");
	        vector.add("Python");
	        vector.add("React");

	        // Create the second Vector
	        Vector<String> vector2 = new Vector<>();
	        vector2.add("java");
	        vector2.add("Python");
	        vector2.add("Mendix");

	        // Print the initial Vectors
	        System.out.println("Vector : " + vector);
	        System.out.println("Vector 2: " + vector2);

	        // Add all elements of vector2 to vector
	        vector2.addAll(vector);

	        // Print the updated Vector 
	        System.out.println("Vector  after adding elements from Vector 2: " + vector2);
	    }
	}


