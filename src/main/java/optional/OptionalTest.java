package src.main.java.optional;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
		Optional<String> val=Optional.empty();
		Optional<String> s= whichReturnsnull();
				
		//s.ifPresent(sx -> System.out.println(sx));//throwing nullpointer exception
		
		
		Optional<String> s1= whichReturnsnullWithOfNullable();
		s1.ifPresent(sx -> System.out.println(sx));
		
		Optional<String> name= Optional.ofNullable("Hello world");
		System.out.println(name.orElse("Welcome"));
				
		
		System.out.println("End");
	}
	
	static Optional<String> whichReturnsnull() { return null;}
	
	static Optional<String> whichReturnsnullWithOfNullable() { return Optional.ofNullable(null);}

}
