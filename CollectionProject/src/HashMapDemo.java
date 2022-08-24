import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// Map implementaions stores a key/value pair
		// the first generic type specifies the type of the key
		// the second generic type specifies the type of the value
		
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();

		// CRUD operations
		// C - Create , add key/value pairs
		phoneBook.put("ABC", 12345);
		phoneBook.put("LMN", 56789);
		phoneBook.put("ASD", 34567);
		
		// R - Read
		// fetch a value for the key specified
		int contactNumber = phoneBook.get("LMN");
		System.out.println("Key : LMN , Value : " + contactNumber);
		
		// traversing through the hashmap
		System.out.println("traversing through the hashmap");
		// we can't connect an iterator to the hashmap because Map interface does not extend Iterable interface
		// first we take all the keys of the hashmap and put it inside a Set
		Set<String> allNames = phoneBook.keySet();
		
		// now connect the set to an iterator
		Iterator<String> itr = allNames.iterator();
		// now traverse throught the iterator
		// as we traverse we get the key, using the key we can take out the value from the 1hashmap
		while(itr.hasNext()) {
			// taking out the key from the iterator
			String key = itr.next();
			// taking out the value for the key from the hashmap
			Integer value = phoneBook.get(key);
			
			System.out.println("{ " + key + " } , { " + value + " }");
			
		}
		System.out.println("------------------------------");
		System.out.println("traversing through the hashmap using foreach");
		phoneBook.forEach((key, value)->System.out.println("{ " + key + " } , { " + value + " }"));
		
		// U - Update
		System.out.println("------------------------------");
		System.out.println("updating the hashmap's value for a key ASD... ");
		phoneBook.replace("ASD", 99999);
		System.out.println(phoneBook);
		
		// D - Delete
		System.out.println("------------------------------");
		System.out.println("removing the hashmap's entry for the key LMN... ");
		phoneBook.remove("LMN");
		System.out.println(phoneBook);
		
	}

}
