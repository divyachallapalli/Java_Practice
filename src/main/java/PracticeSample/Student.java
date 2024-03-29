package PracticeSample;

public class Student {

	//State or Attributes
	String name;
	int rollNo;
	String place;
	
	
	public Student(String name, int rollNo, String place) {
		this.name = name;
		this.rollNo = rollNo;
		this.place = place;
	}


	// Behaviour or Methods - we can perform some logic on the attributes using methods
	String displayStudentInfo() {
		
		String concatData= name + ".."+ rollNo + ".." + place;
		return concatData;
	}
	
}
