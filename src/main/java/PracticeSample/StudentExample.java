package src.main.java.PracticeSample;
//execution starts with class with the main method
public class StudentExample {
	
	public static void main(String[] args) {
		Student stu = new Student("Ravi",12,"Hyderabad");
		String stuData=stu.displayStudentInfo();
		
		System.out.println(stuData);
		
		
		
	}

}
