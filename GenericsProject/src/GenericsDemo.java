import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {
	
		Box box1 = new Box(20, 10, 15);
		System.out.println("box1 : " + box1);
		
		Box box2 = new Box(200, 100, 150);
		System.out.println("box2 : " + box2);

		// can't create box3 for double dimensions
		//Box box3 = new Box(25.5, 13.5, 8.25);
		//System.out.println("box1 : " + box1);
		
		BoxGenerics<Integer, String> box3 = new BoxGenerics<Integer, String>(40,  30,  20, "white");
		System.out.println("box3 : " + box3);
		
		BoxGenerics<Double, StringBuffer> box4 = new BoxGenerics<Double, StringBuffer>(25.5,  13.5,  8.25, new StringBuffer("red"));
		System.out.println("box4 : " + box4);
		
		// the generic type should be a class type and 
				//will never accept a primitive type 
		
		List<Integer> allNumbers = new ArrayList<Integer>();
		
	}

}
