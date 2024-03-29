package JavaConcepts;
import java.util.Scanner;

public class ControlStatements {
	public static void main(String[] args) {
		
		
		//Print 'Even' if the Given number is an even number or else print 'Odd'
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number :");
		int input=scan.nextInt();
		
		
		
		//If else
		if(input %2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
		
		System.out.println("Enter any character :");
		String inputChar=scan.next();
		
		//switch 
		switch(inputChar) {
		case "a" : System.out.println("Vowel: a");
				 break;
		case "e" : System.out.println("Vowel : e");
		          break;
		case "i" : System.out.println("Vowel : i");
					break;
		case "o" : System.out.println("Vowel : o");
					break;
		case "u" : System.out.println("Vowel : u");
        			break;
		default : System.out.println("Consonents");
        			break;
		}
		
		//only if
		if(true)
			System.out.println("Only if");
		
		//nested if
		if(true) {
			if(true) {
				System.out.println("nested if");
			}
		}
		
		
		
		
		
	}
}
