package TechTest270725;

import java.util.TreeSet;

public class FirstAndLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		ts.add(7);
		ts.add(1);
		ts.add(2);
		ts.add(0);
		ts.add(14);
		ts.add(5);
		ts.add(6);
		
		System.out.println("Before Elemnts from TreeSet :"+ts);
		System.out.println("After Elemnts from TreeSet :"+ts.first());
		System.out.println("PollLast Elemnts from TreeSet :"+ts.last());



	}
}



