package TechTest270725;

import java.util.TreeSet;
public class FindLessThanSevenTreeset {
	public static void main(String arg[]) {
	 TreeSet<Integer> ts = new TreeSet<>();
     ts.add(8);
     ts.add(10);
     ts.add(4);
     ts.add(9);
     ts.add(7);
     ts.add(2);
     ts.add(1);
     ts.add(6);
     ts.add(3);


     System.out.println("TreeSet: " + ts);

     // Find numbers less than 7 using headSet()
     TreeSet<Integer> lessThanSeven = (TreeSet<Integer>) ts.headSet(7);

     // Print the numbers less than 7
     System.out.println("Numbers less than 7: " + lessThanSeven);
}
}
