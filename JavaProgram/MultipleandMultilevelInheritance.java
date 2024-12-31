package JavaProgram;
      
      interface vehicle1{
    	  void  start();
    	  
      }
      interface Electric{
    	  void charge();
    	  
      }
      class Machine{
    	  void operate() {
    		  System.out.println("Machine is operating");
    	  }
      }
      class Car extends Machine{
    	  void drive() {
    		  System.out.println("Car is driving ");
    	  }
      }
      class ElectricCar extends Car implements vehicle1,Electric{

		@Override
		public void charge() {
			System.out.println("Electric Car is Charging ");
			
		}

		@Override
		public void start() {
			System.out.println("Electric Car is starting ");
			
		}
    	  
      }
      

public class MultipleandMultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ElectricCar tesla =new ElectricCar();
		tesla.operate();
		tesla.drive();
		tesla.start();
		tesla.charge();

	}

}
