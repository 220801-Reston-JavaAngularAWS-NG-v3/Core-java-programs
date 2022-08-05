
public class Array2DDemo {

	public static void main(String[] args) {
		// declare a 2D array
		int[][] matrixA = new int[3][2];
		
		// assign values to the elements of the 2D array
		matrixA[0][0] = 4;
		matrixA[0][1] = 5;
		matrixA[1][0] = 7;
		matrixA[1][1] = 6;
		matrixA[2][0] = 9;
		matrixA[2][1] = 2;
		
		
		// traverse a 2D array
		// we use 2 nested for loops
		for(int i=0;i<matrixA.length; i++) {
			for(int j=0;j<matrixA[i].length;j++) {
				System.out.print(matrixA[i][j] + "    ");
			}
			System.out.println();
		}
		
		
		// initialize a 2D array
		int[][] matrixB = { {3, 6}, {6, 8}, {7,3} };
		

	}

}
