import java.util.Scanner;

public class RoomDemo {

	public static void main(String[] args) {
		
		// working with Scanner to get the length, width and height as input from the user
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the length:");
		int length = scan.nextInt();
		System.out.println("Please enter the width:");
		int width = scan.nextInt();
		System.out.println("Please enter the height:");
		int height = scan.nextInt();
				
		Room bedroom = new Room(length, width, height);
		
//		bedroom.length = 200;
//		bedroom.width = 100;
//		bedroom.height = 150;
		
		System.out.println("bedroom's floor area:" + bedroom.calculateFloorArea());
		System.out.println("bedrooms' painting cost:" + bedroom.calculatePaintingCost(2));
		
		Room dinning = new Room(300, 200, 150, "grey");
		
//		dinning.length = 300;
//		dinning.width = 200;
//		dinning.height = 150;
		
		System.out.println("dinning's floor area:" + dinning.calculateFloorArea());
		System.out.println("dinning's painting cost:" + dinning.calculatePaintingCost(2));
		
		
		Room living = new Room(400, 300, 150, "cream", 501);

		// CPD - Copy Paste Detector
	}

}
