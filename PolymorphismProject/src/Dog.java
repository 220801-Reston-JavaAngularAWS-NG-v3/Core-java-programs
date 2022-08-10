
public class Dog extends Animal{

	void friendly() {
		System.out.println("Dog is a friend...");
	}
	
	@Override
	void mobility() {
		System.out.println("Dog moves on 4 legs...");
	}
	
	@Override
	void breathe() {
		System.out.println("Dog breathes through lungs...");
	}
}
