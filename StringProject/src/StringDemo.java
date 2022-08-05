import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		
		char ch = 'd';
		
		Scanner scan = new Scanner(System.in);
		
		String str1 = "hello";// preferred
		String str2 = new String("welcome"); // not recommended/preferred
		
		char ch2 = str1.charAt(2);
		System.out.println("Character at index 2:" + ch2);

		int index = str1.indexOf('o');
		System.out.println("Index of 'o':" + index);
		
		// String is immutable
		// they never change
		
		str1 = "every";
		str1 = "hello " + str1;
		
		
	}

}
