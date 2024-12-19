package JavaProgram;

public class LocalVariable {
             public void sum() {
            	 int a=10;
            	 int b=20;
            	 System.out.println(a+b);
            			 
             }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Declare a local variable
		
		
		///this variable is local to this main method
		
		LocalVariable obj=new LocalVariable();
		obj.sum();

	}

}
