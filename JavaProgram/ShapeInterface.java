package JavaProgram;
      
         interface Shape {
          double getArea();
     }

  class Rectangle implements Shape {
   double length, width;

  Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

   public double getArea() {
     return length * width;
  }
 }

 class Circle implements Shape {
   double radius;

   Circle(double radius) {
     this.radius = radius;
 }

 public double getArea() {
     return Math.PI * radius * radius;
 }
}

  class Triangle implements Shape {
      double base, height;

   Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

  public double getArea() {
     return 0.5 * base * height;
 }
}

 public class ShapeInterface {
 public static void main(String[] args) {
     Shape rectangle = new Rectangle(5, 3);
     Shape circle = new Circle(4);
     Shape triangle = new Triangle(6, 2);

     System.out.println("Rectangle Area: " + rectangle.getArea());
     System.out.println("Circle Area: " + circle.getArea());
     System.out.println("Triangle Area: " + triangle.getArea());
 }
}

              
