package src.main.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("Divya");
		list.add("kala");
		list.add("is");
		list.add("innocent");
		
		list.stream().forEach((word)-> System.out.print(word+" "));
		System.out.println();
		
		Stream.of("very","good").forEach((word)-> System.out.print(word+" "));
		
		Arrays.stream(new int[] {1,2,3}).forEach((val) -> System.out.println(val));
		
		Stream.empty().forEach((word)-> System.out.print(" -- "+word+" "));
		
		//infinite streams
		Stream.generate(() -> Math.random()).limit(5).forEach((val) -> System.out.println(val));
		
		int i=2;
		Stream.iterate(2, (j)-> j*2).limit(5).forEach((val) -> System.out.println(val));
		
		//mapM
		list.stream().map((s) -> s.toLowerCase()).forEach((val) -> System.out.print(val + " "));
		System.out.println();
		
		//flatmap
		list.stream().map(s-> s.split("")).forEach((val) -> System.out.print(val + " "));
		System.out.println();
		list.stream().map(s-> s.split("")).flatMap(Arrays::stream).forEach((val) -> System.out.print(val + " "));
		System.out.println();
		//skip
		
		//limit
		
		//filter
		list.stream().filter((s)-> s.startsWith("i")).forEach((val) -> System.out.println(val + " "));
		
		//reduce
		System.out.println(list.stream().reduce("## ",(a,b)-> a.concat(" "+b)));
		
		
		
		//Collect
		System.out.println(list.stream().map(s-> s.split("")).flatMap(Arrays::stream).collect(Collectors.joining("|")));
		System.out.println(list.stream().map(s-> s.split("")).flatMap(Arrays::stream).collect(Collectors.filtering((c)-> c.equalsIgnoreCase("c"), Collectors.toList())));
		
		System.out.println(list.stream().collect(Collectors.groupingBy((d)-> d.matches("D.*"),Collectors.toSet())));
		System.out.println(list.stream().collect(Collectors.groupingBy((d)-> "Divya",Collectors.toSet())));
		System.out.println(list.stream().collect(Collectors.groupingBy((d)-> d.length()%2==0,Collectors.counting())));
		System.out.println(list.stream().collect(Collectors.groupingBy((d)-> d.length()%2==0,Collectors.joining())));
		
		Person[] personList= {new Person("Kala",30,20000,"DEV"),new Person("ahana",40,15000,"DEV"),new Person("kalyana",25,55000,"TEST")};
		Map<Object, List<Person>> map=Arrays.stream(personList).collect(Collectors.groupingBy((p)->p.getDep()));
		System.out.println(map);
		Map<Object, List<Person>> map1=Arrays.stream(personList).collect(Collectors.groupingBy(Person::getDep));
		System.out.println(map1);
		
		System.out.println(list.stream().collect(Collectors.partitioningBy(d -> d.matches("D.*"))));
		
	}
	
}


class Person{
	String name;
	int age;
	long salary;
	String dep;
	
	public Person(String name, int age, long salary, String dep) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dep = dep;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}	
	
	
}
