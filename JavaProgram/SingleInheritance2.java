package JavaProgram;
 class Employee{
	
	 void work() {
		 System.out.println("Emp work");
	 }
	public int  getsalary() {
		return 35000;
	 }
 }
 class HRManager extends Employee{
	
//	 void work() {
//		  System.out.println("HR Manager");
//	 }
	 public void addEmployee(String Name) {
		 System.out.println("New Employee Name :"+Name);
	 }
 }
public class SingleInheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          HRManager obj=new HRManager();
            obj.work();
           System.out.println(obj.getsalary());
           obj.addEmployee("Rajavel");
           
          }
	

}
