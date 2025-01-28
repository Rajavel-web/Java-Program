package TechTest270725;

import java.util.Iterator;
import java.util.TreeSet;

public class ReverseOrderTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     
		         TreeSet<Integer> ts=new TreeSet<Integer>();
					ts.add(1);
					ts.add(2);
					ts.add(3);
					ts.add(4);
					ts.add(5);
					
					System.out.println("The TreeSet: "+ts);
					Iterator<Integer> it=ts.descendingIterator();
					System.out.print("The Reverse order of a TreeSet: ");
					while(it.hasNext()) {
					System.out.print(it.next()+" ");

	}

}
}
