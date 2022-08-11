
public class Room {

	// declare variables
	// static blocks
	// constructors
	// getters/setters
	// methods
	// if required equals and hashcode methods
	// toString() method

	private int length;
	private int width;
	static final int height;
	private String color;
	private int roomNo;
	private int floorArea;
	private int wallArea;

	static {
		height = 150;
	}
	
	Room(int length, int width, int height) {
		// super(); // if you have note provided this() or super()
		this.length = length;
		this.width = width;
		//this.height = height; //removed this because height became static and
								// have initialized it in the static block

	}

	Room(int length, int width, int height, String color) {
		this(length, width, height); // constructor chaining
//		this.length = length;
//		this.width = width;
//		this.height = height;
		this.color = color;
	}

	Room(int length, int width, int height, int roomNo) {
		this(length, width, height); // constructor chaining
//		this.length = length;
//		this.width = width;
//		this.height = height;
		this.roomNo = roomNo;
	}

	Room(int length, int width, int height, String color, int roomNo) {
		this(length, width, height, color); // constructor chaining
//		this.length = length;
//		this.width = width;
//		this.height = height;
//		this.color = color;
		this.roomNo = roomNo;
	}

	// getter for length property
	public int getLength() {
		return length;
	}

	// setter for length property
//	public void setLength(int length) {
//		this.length = length;
//	}

	// getter for color property
	public String getColor() {
		return color;
	}

	// setter for color property
	public void setColor(String color) {
		this.color = color;
	}

	public int getWidth() {
		return width;
	}

//	public void setWidth(int width) {
//		this.width = width;
//	}

	public int getHeight() {
		return height;
	}

//	public void setHeight(int height) {
//		this.height = height;
//	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public int getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(int floorArea) {
		this.floorArea = floorArea;
	}

	public int getWallArea() {
		return wallArea;
	}

	public void setWallArea(int wallArea) {
		this.wallArea = wallArea;
	}

	int calculateFloorArea() {
		floorArea = length * width;
		return floorArea;
	}

	int calculatePaintingCost(int paintingRate) {
		wallArea = (2 * length * height) + (2 * width * height);
		int paintingCost = wallArea * paintingRate;
		return paintingCost;
	}

//	@Override
//	public boolean equals(Object other) {
//		// provide my definition of room objects equality
//		// the current objects length, width and height should be the same as the other object length, width and height
//		Room otherRoom = (Room)other;
//		if(otherRoom == null) {
//			return false;
//		}else if(this.length == otherRoom.length && this.width == otherRoom.width && this.height == otherRoom.height) {
//			return true;
//		}
//		
//		return false;
//		
//	}
//	
//		
//	// whenever you overirde the equals methods you should override the hashcode method() as well
//	// whenever you say 2 objects are equal then their hashcodes also have to be equal
//	@Override
//	public int hashCode() {
//		return (length + width + height);
//	}
//	
	
	
	
	
	@Override
	public String toString() {
		return "Room [length=" + length + ", width=" + width + ", height=" + height + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + length;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (height != other.height)
			return false;
		if (length != other.length)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
	
	
	
}
