import java.util.Comparator;

public class FordFigoComparisonLogic implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// casting super class reference type to sub class reference type 
		FordFigo car1 = (FordFigo)o1;
		FordFigo car2 = (FordFigo)o2;	
		
		// comparison logic is based only on the year
		return car1.year - car2.year;
	}
	

}
