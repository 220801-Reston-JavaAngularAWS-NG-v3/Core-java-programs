import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// step 1 - create an object of the collection
		// ArrayList allNames = new ArrayList(); // not recomended
		
		//List allNames = new ArrayList(); // this is recommended
											// lets say tomorrow i want allNames to point to different implementation it is possible here
		
		List<String> allNames = new ArrayList<String>(); 
		
		// step 2 - perform the CRUD operations on the collection

		// C - Create
		System.out.println("Adding objects to the ArrayList...");
		String msg1 = "hello";
		String msg2 = "welcome";
		String msg3 = "java";
		allNames.add(msg1);
		allNames.add(msg2);
		allNames.add(msg3);
				
		// R - Read
		System.out.println("-----------------------------");
		System.out.println("reading the objects by calling the toString()....");
		System.out.println(allNames);
		System.out.println("-----------------------------");
		// traverse the ArrayList using for loop
		System.out.println("traversing the ArrayList using for loop....");
		for(int i=0;i<allNames.size();i++) {
			System.out.println(allNames.get(i));
		}
		System.out.println("-----------------------------");
		// traverse the ArrayList using enhanced for loop
		System.out.println("traversing the ArrayList using enhanced for loop....");
		for(String message : allNames) {
			System.out.println(message);
		}		
		System.out.println("-----------------------------");
		// traverse the ArrayList using Iterator
		System.out.println("traversing the ArrayList using Iterator....");
		Iterator itr = allNames.iterator(); // connecting allNames to an iterator
											// able to do this because all collections implements Iterable Interface
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------------------------");
		// traverse the ArrayList using forEach (forEach method uses lambda expressions)
		System.out.println("traversing the ArrayList using forEach - lambda expressions....");
		allNames.forEach((msg)->System.out.println(msg));
		
		// U - Update
		System.out.println("-----------------------------");
		System.out.println("Updating...");
		String msg4 = "Bye";
		allNames.set(1, msg4);
		System.out.println(allNames);
		
		// D - Delete
		System.out.println("-----------------------------");
		System.out.println("Deleting...");
		allNames.remove(0);
		System.out.println(allNames);
	}

}
