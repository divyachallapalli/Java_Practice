package src.main.java.methodReferences;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 
 */
public class MethodRefs {
	
	static String snm=new String("Kala");
	public static void main(String[] args) {
		
		//constructor reference
		Supplier<Product> meth=Product::new; 
		Product p=meth.get();
				p.setName("Hamsa");
		System.out.println(p.getName());
		
		MethodRefs.constructorMethodRef(Product::new);
		
		//static method ref
		MethodRefs.parseToInt(String::valueOf);
		
		////Reference to instance method using class ref
		MethodRefs.convertToUppCase(MethodRefs.snm::toUpperCase);
		//Reference to instance method using obj ref
		String s="Divya";
		MethodRefs.convertToLowerCase(s::toLowerCase);
		
		MethodRefs.convertToLowerCase(MethodRefs::getString);//Reference to class method using obj ref since we cannot call non-static methods from static context

	}
	
	public static void constructorMethodRef(Supplier<Product> p) {
		System.out.println("Constructor method reference "+p.get().getName() );
	}
	
	static void parseToInt(Function<Integer,String> at) {
		System.out.println("char at pos 2 is "+ at.apply(1));
	}
	
	static void convertToUppCase(Supplier<String> at) {
		System.out.println("res "+ at.get());
	}
	
	static void convertToLowerCase(Supplier<String> at) {
		System.out.println("res "+ at.get());
		
		MethodRefs m=new MethodRefs();
		MethodRefs.convertToUppCase(m::getString1);////Reference to instance method using obj ref since we cannot call non-static methods from static context
	}
	
	static String getString() {
		return "Divya"+"kala";
	}
	
	String getString1() {
		return "Divya"+"Veeru";
	}

}
