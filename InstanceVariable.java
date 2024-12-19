package JavaProgram;

public class InstanceVariable{
             
	        String name;
	        int age;
	        String address;
	        String course;
	          
	        
	         
	
	public  InstanceVariable(String name,int age,String address,String course) {
		this.name=name;
		this.age=age;
		this.address=address;
		this.course=course;
		
	}
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Address :"+address);
		System.out.println("Course :"+course);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable obj=new InstanceVariable("Rajavel",24,"saitapet","Java FS");
		InstanceVariable obj1=new InstanceVariable("Aravinth",20,"Cromepet","python FS");
		InstanceVariable obj2=new InstanceVariable("Vasanth",24,"Vadapalani","MERN");
		obj.display();
		obj1.display();
		obj2.display();
		
	

	}

}