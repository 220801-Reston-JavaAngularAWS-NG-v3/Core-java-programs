
public class DataTypesDemo {

	public static void main(String[] args) {
//		data types -  8 primitive data types ( interview question)
//
//		whole numbers
//		-------------
//		1. byte - 1 byte
//		2. short - 2 bytes
//		3. int - 4 bytes
//		4. long - 8 bytes
//
//		decimals
//		--------
//		5. float 
//		6. double
//
//		7. char - 1 byte
//
//		8. boolean - 1 byte

		
		
		// java expects you to declare the variables before you use them
		int number1; // declaration
		int number2;
		
		number1 = 30; // assiginment
		number2 = 40;
		
		int number3 = 30; // initializing
		
		double englishMarks = 70.5;
		
		float mathMark = 50.45f;
		float scienceMark = 40.45F;
		float socialMark = (float)60.65;

		//type casting
		// 1. implicit type casting
		// 2. explicit type casting
		
		long number4 = 400;
		// explicit type casting
		int number5 = (int)number4;
		
		short number6 = 250;
		// implicit casting
		long number7 = number6;
		
		char ch = 'a';
		
		boolean flag = true;
		
		// there is a connection between char and int
		// this find the ascii value of a character
		char ch1 = 'q';
		int chInt = (int)ch1; // chInt stores the ascii value of the character stored in the varible ch1
		System.out.println("ch1 : " + ch1);
		System.out.println("chInt : " + chInt);
		
		// try finding the character for a given ascii value
	}

}
