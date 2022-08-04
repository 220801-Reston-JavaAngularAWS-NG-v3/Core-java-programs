
public class FlowControlDemo {

	public static void main(String[] args) {
		// Flow control statements
		// 1) if
		//		a) simple if - without the else block
		//		b) if...else
		//      c) else if ladder - check multiple conditions
		//      d) nested if
		// 2) switch...case
		
		// Looping statement
		// 1) while loop
		// 2) do...while loop
		// 3) for loop
		
		// break
		// continue

		int number1 = 60;
		int number2 = 40;
		if(number1 > number2) {
			// true part
			System.out.println(number1 + " is greater than " + number2);
		} else {
			// false part
			System.out.println(number2 + " is greater than " + number1);
		}
		
		
		// to check if a character is a vowel or not
		char alphabet = 'e';
		
		// working with switch case
		switch(alphabet) {
		case 'a':
			System.out.println(alphabet + " is a vowel!");
			break;
		case 'e':
			System.out.println(alphabet + " is a vowel!");
			break;
		case 'i':
			System.out.println(alphabet + " is a vowel!");
			break;
		case 'o':
			System.out.println(alphabet + " is a vowel!");
			break;
		case 'u':
			System.out.println(alphabet + " is a vowel!");
			break;
		default:
			System.out.println(alphabet + " is a consonant!");
		}
		
		// working with else if ladder
		if(alphabet == 'a') {
			System.out.println(alphabet + " is a vowel!");
		}else if(alphabet == 'e') {
			System.out.println(alphabet + " is a vowel!");
		}else if(alphabet == 'i') {
			System.out.println(alphabet + " is a vowel!");
		}else if(alphabet == 'o') {
			System.out.println(alphabet + " is a vowel!");
		}else if(alphabet == 'u') {
			System.out.println(alphabet + " is a vowel!");
		}else{
			System.out.println(alphabet + " is a consonant!");
		}
		
		// working with for loop
		// 1 - initial value, 2 - condition to exit the loop, 3 - expression which always works make the condition false at a point of time
		
		// write a number 5 times on the console
		int number = 10;
//		System.out.println(number);
//		System.out.println(number);
//		System.out.println(number);
//		System.out.println(number);
//		System.out.println(number);
		
		for(int i=1; i<=5; i++) {
			System.out.println(number);
		}
		
		// write a program to print number from 1 to n
		int number3 = 15;
		for(int i=1; i<=number3; i++) {
			if(i<=5) {
				continue;
			}
			System.out.println(i);
		}
	}

}
