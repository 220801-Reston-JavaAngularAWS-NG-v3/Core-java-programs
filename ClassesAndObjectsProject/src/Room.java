
public class Room {
	int length;
	int width;
	int height;
	int floorArea;
	int wallArea;
	
	Room(int length, int width, int height){
		this.length = length;
		this.width = width;
		this.height = height;
		
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
