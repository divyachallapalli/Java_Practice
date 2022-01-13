package JavaConcepts;

public class Loops {

	public static void main(String[] args) {
		//print Ryan 5 times
		int a=0;
		while(a<5) {
			System.out.println("Ryan");
			a++;
		}
		
		//Print 1-5 Numbers
		for(int i=1;i<=5;i++){
			System.out.println(i);
		}
		
		//Find Sum of First 5 Numbers
		int sum=0,count=1;
		do {
			sum+=count;
			count++;
		}while(count<=5);
		System.out.println("Sum is :"+ sum);
	}
}
