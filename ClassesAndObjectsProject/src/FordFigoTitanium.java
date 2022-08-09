
public class FordFigoTitanium extends FordFigo{

	int noOfAirbags;
	
	// this is automatically injected the compiler into our compiled code
//	FordFigoTitanium(){
//		super();	 // here it is trying to call to a 
						//constructor of its immediate super class 
						//which does not take any parameters
//	}
	
	//
	FordFigoTitanium(String carModel, String color, int year, int noOfAirbags){
		super(carModel, color, year);
		//this.color = color;
		//this.year = year;
		this.noOfAirbags = noOfAirbags;
	}
	
	boolean ejectAirgbags() {
		System.out.println(carModel + " ejects airbags..");
		return true;
	}
	
	boolean applyBrakes() {
		System.out.println(carModel + " applied ABS brakes....");
		return true;
	}
}
