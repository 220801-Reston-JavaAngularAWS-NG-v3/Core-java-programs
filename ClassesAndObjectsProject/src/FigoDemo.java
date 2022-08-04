
public class FigoDemo {

	public static void main(String[] args) {
		
		
		//int mark;
		//mark = 50;
		
		int mark = 50;
		
		//FordFigo figo1;
		//figo1 = new FordFigo();
		
		FordFigo figo1 = new FordFigo();
		
		// i don't see the purpose of creating an object of FigoDemo here
		//FigoDemo demo;
		//demo = new FigoDemo();
		
		figo1.color = "grey";
		figo1.year = 2022;
		figo1.numberPlate = "CSA4567";
		
		figo1.startEngine();
		figo1.accelerate();
		figo1.applyBrakes();
		figo1.stopEngine();
		
		System.out.println("------------------------");
		
		FordFigo figo2 = new FordFigo();
		figo2.color = "white";
		figo2.numberPlate = "ASD2345";
		figo2.year = 2022;
		
		figo2.startEngine();
		figo2.accelerate();
		figo2.applyBrakes();
		figo2.stopEngine();
		
		System.gc();
		// what are the other ways to request for the garbage collector to run?
	}

}
