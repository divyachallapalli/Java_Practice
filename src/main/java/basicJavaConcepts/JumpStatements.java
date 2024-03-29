package JavaConcepts;

public class JumpStatements {

	
	public static void main(String[] args) {
		// continue;
		
		for(int i=1;i<=5;i++){
			if(i == 2)
				continue;
			//System.out.println(i);
		}
		
		
		//break
		for(int i=1;i<=5;i++){
			if(i == 3) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("End");
		
	}
}
