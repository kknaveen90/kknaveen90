package prorgrams;

public class FactorialRecursion {
	
	public static void main(String[] args) {

		//System.out.println("Factorial :" + factorialRecursion(5));
		
		factorialNormal(4);
	}
	
	public static int factorialRecursion(int n){
		
		if(n>1) {
			n= (n*factorialRecursion(n-1));
		return n;}
		else return n;
	}
	
	
public static  void factorialNormal(int n){
	int res=1;
	
	for(int i=n; i>=1; i--) {
		
		 res=res*i; // 1* 4 , 4*3, 12* 2
	}
	
	
	System.out.println(res);
	
		
		
	}
	
}
















