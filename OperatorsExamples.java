package JavaProgram;

public class OperatorsExamples {
	public void ArithmeticOperators() {
		//Arithmetic Operators
		System.out.println("----------------Arithmetic Operators------------------");
		int a=12,b=5;
		
		//Addition Operators
		System.out.println("a + b :"+(a+b));
		
		//Subraction Operators
		System.out.println("a - b :"+(a-b));
		//Multiplication Operators
		System.out.println("a * b :"+(a*b));
		//Division Operators
		System.out.println("a / b :+"+(a/b));
		//Modulo Operators
		System.out.println("a % b :"+(a%b));
	}
	
	  public void AssignmentOperators() {
		  System.out.println("----------------AssignmentOperators------------------");
		   
		//Assignment Operators
			
	      int a1=10;
	      int num;
	
	   //Assign value Using  =
	    num=a1;
	    System.out.println(" = Using :"+num);
	
	    //Assign Value Using =+ 
	    num +=a1;
	    System.out.println(" =+ "+num);
	
	     //Assign Value using =*
	
	     num *= a1;
	
	     System.out.println("*="+num);
	  }
	  
	  public void RelationOperators() {
		  System.out.println("----------------RelationOperators------------------");
		    
			//Relation Operators
			
			//Check if a is Less Than b
			
			int  a=10,b=20;
			
			//Value Of a and b
			
			System.out.println("A is "+a+ "And"+b);
			
			// == Operator
			 System.out.println(a == b);
			 
			 //!= Operators
			 
			 System.out.println(a != b);
			 
			 // > Greterthan Operators
			 
			 System.out.println(a > b);
			 
			 //< Lesserthan Operators
			 
			 System.out.println(a < b);
			 
			 
			 //>= Greterthan Equal 
			 
			 System.out.println(a >= b);
			 
			 //<= Leaaserthan equal
			 
			 System.out.println(a <= b);
	  }
	   public void LogicalOperators() {
		   System.out.println("----------------LogicalOperators------------------");
		 //Logical Operators
			 
			 // && Operators
			 
			 System.out.println("&& Operators  : "+((5>3) && (8>5)));
			 
			 System.out.println("&& Operators : "+((5>3)&&(8<5)));
			 
			 
			 // || Operators
			 
			 System.out.println("|| OR Operators :"+((5<3)||(5>5)));
			 System.out.println((5>3)||(8<3));
			 System.out.println((5<3)||(8<5));
			 
			 
			 //! Operators
			 
			 System.out.println(!(5==3));
			 
			 System.out.println(!(5>3));
	   }
	   public void incrementdecrement() {
		   System.out.println("----------------IncrementDecrement------------------");
			//Icrement And Dcrement Operators
			 
			 int a=12,b=12;
			 
			 int result,result1;
			 System.out.println("Value Of rrr : "+a);
			 
			 //Increment Operators
			 result= ++a;
			 System.out.println("After Increment : "+result);
			 
			 
			 System.out.println("Value Of b "+a);
			 
			 // Decrement Operators
			 
			 result1 = --a;
			 
			 System.out.println("After Decrement : "+result1);
	   }
	    public void instance() {
	    	System.out.println("----------------instanceOf------------------");
	    	//InstanceOf Operators
			 
			 String Str="Rajavel Manivel";
			 
			 boolean val;
			 
			 val=Str instanceof String;
			 System.out.println(val);
			 
	    }
	    public void Bitwise() {
	    	System.out.println("----------------Bitwise------------------");
	    	int a=0b1010;
			int b=0b1100;
			
			System.out.println("a&b :"+(a&b));
			
			System.out.println("a|b :"+(a|b));
			
			System.out.println("a^b :"+(a^b));
			
			System.out.println("a~b:"+(~a));
	    }
	    public void Ternary() {
	    	System.out.println("----------------Ternar Operators------------------");
	    	 int feburaryDays=29;
	    	 String result;
	    	
	    	 //TernaryOperators
	    	 
	    	 result=(feburaryDays==28)? "Not a Leap Year":"Leap Year";
	    	 System.out.println(result);
	    			
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OperatorsExamples  TypeOfOperators =new OperatorsExamples();
		TypeOfOperators.ArithmeticOperators();
		TypeOfOperators.AssignmentOperators();
		TypeOfOperators.RelationOperators();
		TypeOfOperators.LogicalOperators();
		TypeOfOperators.incrementdecrement();
		TypeOfOperators.instance();
		TypeOfOperators.Bitwise();
		TypeOfOperators.Ternary();

		
	}

}
