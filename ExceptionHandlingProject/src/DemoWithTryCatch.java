
public class DemoWithTryCatch {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		int c = 0;
		
		System.out.println("Going to divide...");
		
		try {
			c = a / b; // exception has occured in this line
			System.out.println("in try block...");
			// 1. jvm identifies that an exception has occured 
						//and also the type of exception
			// 2. jvm creates an object of ArithmeticException
			// 3. jvm throws the object
		} catch(ArithmeticException ae) {
			// executes these lines of code
			System.out.println("in catch block...");
			System.out.println("you have divided a number by zero...");
			b = 1;
			c= a / b;
			
		}
		
				
		System.out.println("Answer is :  " + c);
		
		System.out.println("rest of the program is executed....");
		System.out.println("program is over...");
	}

}
