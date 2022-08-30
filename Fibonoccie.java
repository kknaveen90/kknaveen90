package prorgrams;

public class Fibonoccie {
	static int n1 = 0, n2 = 1, sum = 0;
	
	public static void main(String[] args) {
		
		
		//recursive fib
		 System.out.print(n1 + " " + n2);
			
		 fibbonacciRecusive(4);
	}
	
	//normal way
	public static void fibonoccie(int n){
		int n1=0, n2=1; 
		int sum = 0;
		
		System.out.println(n1 + " " +n2); // 0 1       // 0 1 1 2 3
		
		for(int i=2; i< n; i++) {
			
			sum = n1+n2; //1
			System.out.print(" " +sum); // 1   // 0 1 1
			n1=n2;
			n2=sum;
			
		}
		
	
	}
	

	//recusrive fibonaccie
	public static int fibbonacciRecusive(int n){
		
		if (n > 0) {
	         sum = n1 + n2;
	         n1 = n2;
	         n2 = sum;
	         System.out.print(" " + sum);
	         fibbonacciRecusive(n - 1);
	      }
		return n;
		
}

	
}















