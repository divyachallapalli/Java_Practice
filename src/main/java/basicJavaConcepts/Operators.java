package JavaConcepts;

public class Operators {
	public static void main(String[] args) {
		int a=1, b=2;
		int sum = a + b;
		System.out.println(sum);
		
		int sub = a -b ;
		System.out.println(sub);
		
		int mul = a * b;
		System.out.println(mul);
		
		int div = a / b;
		System.out.println(div);
		
		sum+=1; //evaluates to sum= sum+1 -=,*=,/=
		
		System.out.println(sum);
		
		sum*=2; //sum = sum*2;
		System.out.println("sum after multiplication assignment" +sum);
		
		int c = a++; //c= a ,a=a+1
		int d= ++b; //b=b+1, d=b          a--,--a
		
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		System.out.println("Relational Operator :"+ (2>1)); //<=!=
		
		//Ternery Operator
		if(a==1) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		//equivalent
		System.out.println(a==1 ? "Equal" : "Not Equal");
		
		
	}

}
