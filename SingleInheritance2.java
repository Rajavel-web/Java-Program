package JavaProgram;
 class Employee{
	
	 void work() {
		 System.out.println("Emp work");
	 }
	public void salary(int salary) {
		System.out.println("Employee Salary: "+salary);
	 }
 }
 class HRManager extends Employee{
	
	 void work() {
		  System.out.println("HR Manager");
	 }
	 public void addEmployee(String Name) {
		 System.out.println("New Employee Name :"+Name);
	 }
 }
public class SingleInheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          HRManager obj=new HRManager();
            obj.work();
            obj.salary(35000);
           obj.addEmployee("Rajavel");
           
          }
	

}
