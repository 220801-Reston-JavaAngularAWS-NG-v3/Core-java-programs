import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		
		// 1) conventional way to implement a functional interface Operation
		// interface refernce variable pointing to the implementation object
		Operation add = new Addition();
		System.out.println("addition (conventional way) : " + add.operate(5, 8));
		
		
		Operation multiply = new Product();
		System.out.println("product (conventional way) : " + multiply.operate(5, 8));

		// 2) anaonymous class way to implement function interface Operation
		// an anonymous class is a class that doesnt have a name
		Operation add1 = new Operation() { // anonymous class which implements Operation
							@Override
							public int operate(int num1, int num2) {
								return num1 + num2;
							}
						};
		System.out.println("addition1 (anonymous class way) : " + add1.operate(5, 8));
		
		Operation multiply1 = new Operation() { // anonymous class which implements Operation
							@Override
							public int operate(int num1, int num2) {
								return num1 * num2;
							}
						};
		System.out.println("product1 (anonymous class way) : " + multiply1.operate(5, 8));
		
		// 3) lambda expressions to implement the function interface Operation
		// we have very less(boiler plate) code when we implemented the functional interface using lambda expression 
		Operation add2 =(num1, num2) -> num1 + num2;
		System.out.println("addition2 (lambda expression way) : " + add2.operate(5, 8));
		
		Operation multiply2 =(num1, num2) -> num1 * num2;
		System.out.println("product2 (lambda expression way) : " + multiply2.operate(5, 8));
		
		
		// java provides a lot of inbuilt functional interfaces
		// so we can use those inbuilt functional interfaces instead we creating a new functional interface (Operation)
		// these inbuilt functional interfaces are available in the java.util.function package
		
		// i am going to use an inbuilt functional interface instead Operation
		// BiFunction functional interface suits our requirement
		
		BiFunction<Integer, Integer, Integer> add3 = (number1, number2) -> number1 + number2;
		System.out.println("addition3 (lambda expression way using inbuild functional interface) : " + add3.apply(5, 8));
		
		BiFunction<Integer, Integer, Integer> multiply3 = (number1, number2) -> number1 * number2;
		System.out.println("product3 (lambda expression way using inbuild functional interface) : " + multiply3.apply(5, 8));
		
		// lambda expresion to check if a number is greater than 50
		Predicate<Integer> check = (number)->number>50;
		int num = 80;
		System.out.println(num + " greater that 50? " + check.test(num));
		
		List<Integer> allNumbers = new ArrayList<Integer>();
		allNumbers.add(34);
		allNumbers.add(50);
		allNumbers.add(70);
		allNumbers.add(23);
		allNumbers.add(11);
		
		System.out.println("--------------------------------");
		// the forEach opens an internal iteration
		allNumbers.forEach((obj)->System.out.println(obj));
		// the removeIf opens an internal iteration
		System.out.println("--------------------------------");
		
		
		// sorting the collection in ascending order
		System.out.println("Ascending order...");
		List<Integer> sortedNumbers = allNumbers.stream().sorted((data1, data2)->data1-data2).collect(Collectors.toList());
		sortedNumbers.forEach((obj)->System.out.println(obj));
		
		System.out.println("--------------------------------");
		System.out.println("Descending order...");
		List<Integer> sortedNumbers1 = allNumbers.stream().sorted((data1, data2)->data2-data1).collect(Collectors.toList());
		sortedNumbers1.forEach((obj)->System.out.println(obj));
		
		System.out.println("--------------------------------");
		System.out.println("sum of the numbers in the collection allNumbers");
		Integer sum =allNumbers.stream().reduce((num1, num2)->num1+num2).get();
		System.out.println("Sum of the numbers : " + sum);
		System.out.println("--------------------------------");
		allNumbers.removeIf((data)->data<50);
		
//		Iterator<Integer> itr = allNumbers.iterator();
//		while(itr.hasNext()) {
//			Integer number = itr.next();
//			if(number<50) {
//				allNumbers.remove(number);
//			}
//		}
		
		System.out.println("--------------------------------");
		
		allNumbers.forEach((obj)->System.out.println(obj));
		
	}

}
