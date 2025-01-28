package TechTest270725;
import java.util.Vector;

public class InsertIntoVector {

    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        
        vector.add("MS Dhoni ");
        vector.add("Ruturaj Gaikwad ");
        vector.add("Ravindra Jadeja");
		System.out.println("The normal vector: "+vector);
		
		//Add element into specified index
		vector.insertElementAt("Shivam Dube ", 2);
		System.out.println("After adding element into index 2: "+vector);
       
    }

}
