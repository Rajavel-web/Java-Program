package JavaProgram;
   class Animal{
	   void makeSound() {
		   System.out.println("Animal Sound");
	   }
   }
   class Cat extends Animal{
	   void makeSound(){
		   System.out.println("Meow......");
	   }
   }
public class SingleInheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Cat obj=new Cat();
              obj.makeSound();
             
              
	}

}
