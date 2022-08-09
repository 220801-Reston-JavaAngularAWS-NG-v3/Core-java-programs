
public class FigoDemo {

	public static void main(String[] args) {
		
		
		//int mark;
		//mark = 50;
		
		int mark = 50;
		
		//FordFigo figo1;
		//figo1 = new FordFigo();
		
		FordFigo figo1 = new FordFigo("FordFigo" ,"grey", 2022);
		
		// i don't see the purpose of creating an object of FigoDemo here
		//FigoDemo demo;
		//demo = new FigoDemo();
		
		//figo1.color = "grey";
		//figo1.year = 2022;
		figo1.numberPlate = "CSA4567";
		
		figo1.startEngine();
		figo1.accelerate();
		figo1.applyBrakes();
		figo1.stopEngine();
		
		System.out.println("------------------------");
		
		FordFigo figo2 = new FordFigo("FordFigo", "white", 2022);
		//figo2.color = "white";
		figo2.numberPlate = "ASD2345";
		//figo2.year = 2022;
		
		figo2.startEngine();
		figo2.accelerate();
		figo2.applyBrakes();
		figo2.stopEngine();
		
		System.gc();
		// what are the other ways to request for the garbage collector to run?
		
		System.out.println("------------------------");
		FordFigoTitanium ft1  = new FordFigoTitanium("FordFigoTitanium" ,"white", 2022, 4);
		
		ft1.numberPlate = "FGHD1234";
//		ft1.color = "white";
//		ft1.year = 2022;
//		ft1.noOfAirbags = 4;
//		
		ft1.startEngine(); // is present in the super class FordFigo
		ft1.accelerate();
		ft1.applyBrakes();
		ft1.ejectAirgbags(); // is present in the sub class FordFigoTitanium
		ft1.stopEngine();
		
	}

}
