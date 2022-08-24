import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		// adding inbuilt class type objects- String
		
		SortedSet<String> allNames = new TreeSet<String>();
		
		
		allNames.add("hello");
		allNames.add("welcome");
		allNames.add("java");
		//allNames.add(45); // compiler error as we have specified the generic type as String for allNames
		
		System.out.println("traversing a TreeSet using Iterator...");
		Iterator itr = allNames.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------------");
		
		// adding user defined class type objects to the TreeSet - Room
		SortedSet<Room> allRooms = new TreeSet<Room>();
		allRooms.add(new Room(200, 100, 150)); // cannot add Room aobjects to this collection unless 
													//the Room class implements Comparable interface
		allRooms.add(new Room(400, 200, 150));
		allRooms.add(new Room(200, 100, 150));
		allRooms.add(new Room(300, 150, 150));
		
		//System.out.println("Printing allRooms : " + allRooms);
		System.out.println("traversing a TreeSet using Iterator...");
		Iterator itrRoom = allRooms.iterator();
		while(itrRoom.hasNext()) {
			System.out.println(itrRoom.next());
		}
		
		// now I want to add FordFigo objects to a TreesSet
		// however FordFigo is beign used from a third party library 
				//and FordFigo does not implement Comparable interface
		
		//TreeSet<FordFigo> allCars = new TreeSet<FordFigo>();
		
		//allCars.add(new FordFigo("FordFigo", "white", 2020));
		//allCars.add(new FordFigo("FordFigo", "silver", 2022));
		//allCars.add(new FordFigo("FordFigo", "silver", 2018));
		
		// we go for Comparator 
		//TreeSet<FordFigo> allCars = new TreeSet<FordFigo>(new FordFigoComparisonLogic());
		TreeSet<FordFigo> allCars = new TreeSet<FordFigo>((obj1, obj2) -> {
																// casting super class reference type to sub class reference type 
																FordFigo car1 = (FordFigo)obj1;
																FordFigo car2 = (FordFigo)obj2;	
																
																// comparison logic is based only on the year
																return car1.year - car2.year;
															});
		allCars.add(new FordFigo("FordFigo", "white", 2020));
		allCars.add(new FordFigo("FordFigo", "silver", 2022));
		allCars.add(new FordFigo("FordFigo", "silver", 2018));
		
		System.out.println("----------------------------");
		System.out.println("traversing a TreeSet using Iterator...");
		Iterator itrCar = allCars.iterator();
		while(itrCar.hasNext()) {
			System.out.println(itrCar.next());
		}
	}

}
