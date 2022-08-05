
public class Array1DDemo {

	public static void main(String[] args) {
		
//		//Java arrays
//		-----------
//			- arrays are objects
// 			- arrays are of fixed size
//			- help us to store multiple values of the same data type
//			- arrays are accessed using the index
//			- can create 1 dimensional, 2 dimensional, 3 dimensional etc
//			- we also have irreregular arrays in java

		
		int englishMark = 60;

		
		// declare an array, by specify the size
		int[] myMarks = new int[5];
		char[] vowels = new char[5];
		boolean[] status = new boolean[10];
		String[] allNames = new String[8];
		
		// assigned values to the individuals elements of the array
		myMarks[0] = 70;
		myMarks[1] = 80;
		myMarks[2] = 50;
		myMarks[3] = 60;
		myMarks[4] = 75;
		
		//traversing the array
		for(int i=0; i<myMarks.length; i++) {
			System.out.println(myMarks[i]);
		}
		
		// this gives ArrayIndexOutOfBoundsException
		System.out.println(myMarks[10]);
		
		// since arrays are objects, their super class is also Object
		// so we can use an Object reference variable to point to an array
		Object obj = myMarks;
		
		// initializing an array
		// there is no need to use new keyword
		// there is no need to specify the size 
		int[] myMarks1 = {70, 80, 50, 60, 75};
		
		// array of objects
		FordFigo figo = new FordFigo();
		
		// if want to quickly create 20 objects of FordFigo , create an array of FordFigo
		// actually i have created an array of 3 FordFigo reference variable,
		//I have not created the FordFigo objects yet
		
		FordFigo[] allFigoCars = new FordFigo[3];
		// we have to make each FordFigo reference varibale of the array to point to a FordFigo object
		allFigoCars[0] = new FordFigo();
		allFigoCars[1] = new FordFigo();
		allFigoCars[2] = new FordFigo();
		
		// here we are initializing the array with FordFigo obejcts
		FordFigo[] allFigoCars1 = { new FordFigo(), new FordFigo(), new FordFigo()};// same as line 47
		
	}

}
