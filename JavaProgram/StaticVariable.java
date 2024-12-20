package JavaProgram;
import java.io.*;

public class StaticVariable{
  
    static int num = 10;
    static String str = "Rajavel";

   
    static void display()
    {
        System.out.println("Number " + num);
        System.out.println("Name " + str);
    }

   
    public static void main(String args[])
    {
    	StaticVariable obj = new StaticVariable();
                  display();
    }
}