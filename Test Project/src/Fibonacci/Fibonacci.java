package Fibonacci;
// Maria Siddiqui
public class Fibonacci {
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int limit=12;//fibonacci series of 12 numbers
		
		System.out.print(n1+" "+n2);//prints 0 and 1
		for (int i=2; i<limit; i++){
			
			int sum=n1+n2;
			System.out.print(" "+sum);//prints sum of previous two numbers
			n1=n2;
			n2=sum;
		}
		
	}

}
