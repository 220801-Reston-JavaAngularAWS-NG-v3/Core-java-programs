
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
		
	}

}
