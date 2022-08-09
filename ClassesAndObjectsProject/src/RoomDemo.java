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
		//bedroom.color = "Pink"; // not possible because we have made the data members private
		bedroom.setColor("Pink"); // going forward we have to use the setter method to set the values for the private properties
		
		System.out.println("bedroom's floor area:" + bedroom.calculateFloorArea());
		System.out.println("bedrooms' painting cost:" + bedroom.calculatePaintingCost(2));
		
		Room dinning = new Room(300, 200, 150, "grey");
		
//		dinning.length = 300;
//		dinning.width = 200;
//		dinning.height = 150;
		
		System.out.println("dinning's floor area:" + dinning.calculateFloorArea());
		System.out.println("dinning's painting cost:" + dinning.calculatePaintingCost(2));
		
		System.out.println("-----------------------");
		
		Room living = new Room(400, 300, 150, "cream", 501);

		System.out.println(living.getLength());
		System.out.println(living.getWidth());
		System.out.println(living.getHeight());
		System.out.println(living.calculateFloorArea());
		
		System.out.println(living); // will print the address,
									//if you want something meaningful to be printed over the toString() method
									// this implicitly calls the toString() 
		System.out.println(living.toString()); // line 46 also implcitly calls the toString() method
												// our Room class does not have the toString() method
												// to toString() method comes from the Object super class
		// CPD - Copy Paste Detector
		
		System.out.println("----------------------------");
		Room room1 = new Room(200, 100, 150);
		Room room2 = new Room(200, 100, 150);
		Room room3 = new Room(600, 400, 150);
		Room room4 = room3;
		
		System.out.println("room1==room2 : " + (room1 == room2)); 
		System.out.println("room2==room3 : " + (room2 == room3));
		System.out.println("room3==room1 : " + (room3 == room1));
		System.out.println("room4==room3 : " + (room4 == room3));
		
		System.out.println("----------------------------");
		
		System.out.println("room1.equals(room2) : " + (room1.equals(room2))); 
		System.out.println("room2.equals(room3) : " + (room2.equals(room3)));
		System.out.println("room3.equals(room1) : " + (room3.equals(room1)));
		System.out.println("room4.equals(room3) : " + (room4.equals(room3)));
	}

}
