
public class AnimalDemo {

	public static void main(String[] args) {	
		Animal animal = new Animal();
		animal.mobility();
		animal.livingThing();
		
		System.out.println("===============");
		
		Dog dog = new Dog();
		dog.mobility();
		dog.livingThing();
		dog.friendly();
		
		System.out.println("===============");
		
		Snake snake = new Snake();
		snake.mobility();
		snake.livingThing();
		snake.attacks();
		
		System.out.println("===============");
		Animal animal1 = new Dog(); // compare this with line 5 and 11
									// here a super class reference variable is pointing to a sub class object
									// implcit casting has taken place
		
		animal1.mobility();
		animal1.livingThing();
		//animal1.friendly(); // here the compiler doesnt allow us to call the extra method of the Dog class
		
		Dog dog1 = (Dog) animal1; // here we are explicity casting animal1 back to Dog type
									// also called as down casting
		dog1.livingThing();
		dog1.mobility();
		dog1.friendly(); // now the compiler allows you to access the extra method of the sub class
		
		Animal animal2 = dog1; // implicitly casted
								// also called as up casting
		
		System.out.println("===============");
		// what will happen here?
		Snake snake2 = (Snake)animal2; // explicit casting
		
		// further explore instanceof operator in java
		if(animal2 instanceof Dog) {
			// cast animal2 to Dog refernce
			Dog dog2 = (Dog)animal2;
		}else if(animal2 instanceof Snake) {
			// then cast it to snake
			Snake snake3 = (Snake)animal2;
		}
	}

}
