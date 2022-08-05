
public class IrregularArraysDemo {

	public static void main(String[] args) {
		
		// we are creating an irregular 2D array
		int[][] irrArray = new int[3][];
		
		irrArray[0] = new int[3];
		irrArray[1] = new int[1];
		irrArray[2] = new int[10];
		
		// traverse a irregular 2D array
		// we use 2 nested for loops
		for(int i=0;i<irrArray.length; i++) {
			for(int j=0;j<irrArray[i].length;j++) {
				System.out.print(irrArray[i][j] + "    ");
			}
			System.out.println();
		}	
				
		System.out.println("-----------------------------");
		// initialize a irregular 2D array
		int[][] irrArray2 = { {3, 6, 7}, {6}, {7,3, 3, 7, 1, 9, 2 ,9} };
			
		for(int i=0;i<irrArray2.length; i++) {
			for(int j=0;j<irrArray2[i].length;j++) {
				System.out.print(irrArray2[i][j] + "    ");
			}
			System.out.println();
		}	
		

	}

}
