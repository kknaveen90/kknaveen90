package prorgrams;

public class AA2bbb3c1dddd4 {
	
public static void main(String args[]) {
	String s = "AAAbbbcddddaabbuu"; //souptut://A3b3c1d4a2b2u2
		
	// eacchchar with adjecentChar  compare lopp
	// if adjecent char is diffrent print previous loop count next to chars ...xtra
		
		//A3b3c1d4a2b2u2 -  loop charAt[i] + count 
	
	
	String resSt ="";
	for (int i = 0; i < s.length(); i++) {
		int count =1;
		//increase count if adjecent char is same 
		for (int j=i; (i<s.length()-1) && (s.charAt(i) == s.charAt(i+1)); i++) { 
			count++;
		
		} 
			resSt += s.charAt(i) +""+ count;  // if adjecent char is different apped the count to that char
			
	}	
	System.out.print(resSt);
}
/*
 * while((i<s.length()-1) && (s.charAt(i) == s.charAt(i+1))) { count++; i++; }
 */

}
