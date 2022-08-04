
public class RoomDemo {

	public static void main(String[] args) {
		Room bedroom = new Room(200, 100, 150);
		
//		bedroom.length = 200;
//		bedroom.width = 100;
//		bedroom.height = 150;
		
		System.out.println("bedroom's floor area:" + bedroom.calculateFloorArea());
		System.out.println("bedrooms' painting cost:" + bedroom.calculatePaintingCost(2));
		
		Room dinning = new Room(300, 200, 150);
		
//		dinning.length = 300;
//		dinning.width = 200;
//		dinning.height = 150;
		
		System.out.println("dinning's floor area:" + dinning.calculateFloorArea());
		System.out.println("dinning's painting cost:" + dinning.calculatePaintingCost(2));
		
		

	}

}
