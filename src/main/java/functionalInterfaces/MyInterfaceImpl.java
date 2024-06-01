package src.main.java.functionalInterfaces;

import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class MyInterfaceImpl {

	public static void main(String[] args) {
		// Lambda Expressions-This style of programming is eliminating the effort to create class and implement interface and provide my impl.(boilerplate)
		
		//calling my own functional interface
		//way 1- calling directly
		MyInterface myIn=(name)-> System.out.println("Hello world "+name); 
		myIn.printHello("kavya");
		
		//way 2 - passing this as argument
		MyInterfaceImpl im=new MyInterfaceImpl();
		im.test((name)-> System.out.println("Hello world "+name));
		
		//passing Predicate function as method argument
		im.testPredicate((age)-> age>18 ? true :false);
		
		//call supplier interface directly
		Supplier<Integer> supp= ()-> 10;
		System.out.println("received from supplier function"+supp.get());
		
		//predicate isEqual-- just compares object equality
		Predicate<String> p1=(name) -> name.startsWith("S");
		Predicate<String> p2=(name) -> name.startsWith("S");
		System.out.println("Predicate equality "+p1.equals(p1));//true
		System.out.println("Predicate equality "+p1.equals(p2));//false
		
		
		//Predicate - one input and boolean output
		//Function  - one input and one output
		//Supplier  - one output
		//Consumer  - one input
		//UnaryOperator - one input and output of same type
		//BinaryOperator - Two input and one output of same type
		//BiPredicate -two input and boolean output
		//BiFunction -two input and one output
		//BiConsumer - two inputs
		
		//There are many primitive type functional interfaces - these methods eliminate the overhead of autoboxing and unboxing when dealed with primitive datatype wrapper classes
		//IntPredicate-IntFunction<T>-IntConsumer-IntSupplier-ToIntFunction<T> etc..
	}
	
	private void test(MyInterface intf) {
		System.out.println("test method impl");
		intf.printHello("divya");
	}
	
	private void testPredicate(Predicate<Integer> isAdult) {
		System.out.println("in testPredicate method");
		System.out.println("Check if adult age group(age>18)" + isAdult.test(18));
	}
	

}
