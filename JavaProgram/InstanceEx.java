package EaxmpleProgram;

class Student {
    String name;
     int age;
     String department;

   
    public Student(String name , int age,String department) {
    	this.name=name;
    	this.age=age;
    	this.department=department;
         
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}

public class InstanceEx {
    public static void main(String[] args) {
    	System.out.println("Student Information:");
    	Student student = new Student("Rajavel",24,"BCA");
    	student.display();
    	
    	

    }
}


