
package prorgrams;

class TreeGrowsInYear {
	// Tree grows in 2-cycles per year 
	// in spring hight doubles and summer heigh increases by 1
	// in 6 yrs how much height it as grownup
	public static void main(String[] args)
	{
		int n = 6;
		int tot=2*(1) + 1;
		int nextTot=0;
		
		for (int i = 2; i <= n; i++) {
			nextTot = 2*(tot)+1; //7 // 15 .. 
			tot=nextTot; //7 15
			
		}
		System.out.println(tot);
	}
}



















