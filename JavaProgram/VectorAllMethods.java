package TechTest270725;
import java.util.Vector;

public class VectorAllMethods {
    public static void main(String[] args) {
        // Create and initialize the Vector
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Date");
        vector.add("Elderberry");

        System.out.println("Original Vector: " + vector);

        // insertElementAt()
        vector.insertElementAt("Fig", 2);
        System.out.println("After insertElementAt(): " + vector);

        // firstElement() and lastElement()
        System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());

        // remove()
        vector.remove("Cherry");
        System.out.println("After remove(): " + vector);

        // removeElementAt()
        vector.removeElementAt(1);
        System.out.println("After removeElementAt(): " + vector);

        // removeIf()
        vector.removeIf(element -> element.startsWith("E"));
        System.out.println("After removeIf(): " + vector);

        // Remove a range of elements
        vector.subList(0, 1).clear(); 
        System.out.println("After removeRange(): " + vector);

        // removeAll()
        vector.clear();
        System.out.println("After removeAll(): " + vector);
    }
}
