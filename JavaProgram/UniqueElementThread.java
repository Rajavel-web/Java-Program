package TechTask280125;
import java.util.HashSet;
import java.util.Set;

class Unique extends Thread {
    int arr[] = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };

    @Override
    public void run() {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]); 
        }
        
        System.out.println("Unique elements: " + set);
    }
}

public class UniqueElementThread {
    public static void main(String[] args) {
        Unique unique = new Unique();
        unique.start();
    }
}