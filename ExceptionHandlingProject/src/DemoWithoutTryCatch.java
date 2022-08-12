
// java Demo hello welcome
public class DemoWithoutTryCatch {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		int c = 0;
		
		System.out.println("Going to divide...");
		
		c = a / b;
				// 1. jvm identifies that an exception has occured 
								//and also the type of exception
				// 2. jvm creates an object of ArithmeticException
				// 3. jvm throws the object
				// 4. this object which is thrown is caught by the default handler
				// when the control goes to the default handler it is never going to come back to the program
				// exceptions may occur when the program is executed
		
		System.out.println("Answer is :  " + c);
		
		System.out.println("rest of the program is executed....");
		System.out.println("program is over...");
		
		
	}

}
