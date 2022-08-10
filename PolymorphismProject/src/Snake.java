
public class Snake extends Animal{
	
	void attacks() {
		System.out.println("snake hisses....");
	}

	void mobility() {
		System.out.println("Snake moves by crawling...");
	}

	@Override
	void breathe() {
		System.out.println("Snake breathes through something...");
		
	}
}
