package TechTest270725;

class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
           
    }
}
}

class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 19; i += 2) {
            System.out.println("Odd: " + i);
          
    }
}
}
public class OddOrEvenThread {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

         // Start the even thread second
        evenThread.start();  // Start the odd thread first
        oddThread.start();
        
        try {
        	  evenThread.join();
        oddThread.join();
      
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    

}
}
