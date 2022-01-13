package JavaConcepts;

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		//Non-Primitive Data Types
		
				String s = new String("Divyakala");
				
				String str= "Divya";
				
				System.out.println(s + "..."+ str);
				
				
				//person and person1 are object of class Person
				Person person= new Person(13,"Kavya",false);  //Object creation is called Constructor calling
				
				Person person1= new Person(15,"Navya",true);
				
				System.out.println(person.age);
				System.out.println(person1.age);
				
				
				int[] arr= new int[4];
				char[] arr1= new char[] {'q','w','e','r'};
				
				arr[0]= 1;
				arr[1]=2;
				arr[2]= 3;
				
				System.out.println(arr[2]);
				System.out.println(arr1[2]);
				
	}
}

class Person{
	int age;
	String name;
	boolean isMarried;
	
	//Constructor
	public Person(int age, String name, boolean isMarried) {
		super();
		this.age = age;
		this.name = name;
		this.isMarried = isMarried;
	}
	
	
}
