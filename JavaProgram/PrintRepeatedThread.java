package TechTask280125;

class Array extends Thread{
	int a[] =  {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 1, 9, 10, 3};

	public void run() {
		for(int i =0; i< a.length; i++) {
			for(int j= i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+" ");
				}
				
			}
		}
	}
}
public class PrintRepeatedThread {

	public static void main(String[] args) {
		
	Array arr = new Array();
	arr.start();

	}

}