package TechTest270725;
import java.util.Arrays;

class Sort extends Thread {
    int[] arr = {5, 6, 3, 7, 8, 4, 10, 2, 9, 1};


    @Override
    public void run() {

        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}

public class SortsArrayThread {
    public static void main(String[] args) {
    	
        Sort sortThread = new Sort();
        sortThread.start();

        
    }


}