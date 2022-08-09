
public class Room {
	int length;
	int width;
	int height;
	String color;
	int roomNo;
	int floorArea;
	int wallArea;
	
	
	Room(int length, int width, int height){
		//super(); // if you have note provided this() or super()
		this.length = length;
		this.width = width;
		this.height = height;
		
	}
	
	Room(int length, int width, int height, String color){
		this(length, width, height); // constructor chaining
//		this.length = length;
//		this.width = width;
//		this.height = height;
		this.color = color;
	}
	
	Room(int length, int width, int height, int roomNo ){
		this(length, width, height); // constructor chaining
//		this.length = length;
//		this.width = width;
//		this.height = height;
		this.roomNo = roomNo;
	}
	
	Room(int length, int width, int height, String color, int roomNo){
		this(length, width, height, color); // constructor chaining
//		this.length = length;
//		this.width = width;
//		this.height = height;
//		this.color = color;
		this.roomNo = roomNo;
	}
	
	int calculateFloorArea() {
		floorArea = length * width;
		return floorArea;
	}
	
	int calculatePaintingCost(int paintingRate) {
		wallArea = (2 * length * height) + ( 2* width * height);
		int paintingCost = wallArea * paintingRate;
		return paintingCost;
	}	
}
