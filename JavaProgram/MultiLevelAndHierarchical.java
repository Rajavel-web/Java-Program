package JavaProgram;

  class Person {
    String name;

    
    Person(String name) {
        this.name = name;
    }

   
    void info() {
        System.out.println("Name: " + name);
    }
}

class Emp extends Person { 
    Emp(String name) {
        super(name); 
    }

   
    void work() {
        System.out.println(name + " is working");
    }
}

class Manager extends Emp {
    Manager(String name) {
        super(name); 
    }

   
    void manage() {
        System.out.println(name + " is Managing The Team");
    }
}

class Developer extends Emp { 
    Developer(String name) {
        super(name);
    }

    
    void develop() {
        System.out.println(name + " is Developing Software.");
    }
}

public class MultiLevelAndHierarchical {
    public static void main(String[] args) {
       
        Manager manager = new Manager("Rajavel");
        Developer developer = new Developer("Vasanth Raj");

        
        manager.info();
        manager.work();
        manager.manage();

        
        developer.info();
        developer.work();
        developer.develop();
    }
}

