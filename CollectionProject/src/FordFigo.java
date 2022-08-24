
public class FordFigo {

	String numberPlate;
	String color;	
	int year;
	String carModel;

	// add a constructors with no parametrs
	
	FordFigo(String carModel, String color, int year){
		//super(); // in this line the super most class Object's constructor is called
		this.carModel = carModel;
		this.color = color;
		this.year = year;
	}
	
	boolean startEngine() {
		System.out.println(carModel + " engine started...");
		return true;
	}
	
	boolean stopEngine() {
		System.out.println(carModel + " engine stopped...");
		return true;
	}
	
	boolean accelerate() {
		System.out.println(carModel + " accelerated...");
		return true;
	}
	
	boolean applyBrakes() {
		System.out.println(carModel + " manual brakes applied....");
		return true;
	}

	@Override
	public String toString() {
		return "FordFigo [numberPlate=" + numberPlate + ", color=" + color + ", year=" + year + ", carModel=" + carModel
				+ "]";
	}
	
}
