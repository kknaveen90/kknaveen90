package prorgrams;

import java.util.HashSet;
import java.util.stream.Stream;

public class printDuplicateInString {
	
public static void main(String args[]) {
	String s = "ABABCDCDUILCDAB";
	String r="";
	char eachChar[]= s.toCharArray();
	HashSet<Character> hs = new HashSet<Character>();
	HashSet<Character> repUniqueLetters = new HashSet<Character>();
	for( int i=0; i<eachChar.length; i++) {
		if(!hs.contains(eachChar[i])){
			hs.add(eachChar[i]); //AB
			}
		else if(!repUniqueLetters.contains(eachChar[i]))
			repUniqueLetters.add(eachChar[i]); //ABCDCDAB
		
	}
	System.out.println(hs+ "DuplicatesInString: "+ repUniqueLetters);
	
	/*// uniqu elements used 2-hashsets bad approach
	 * hs.removeAll(repUniqueLetters); System.out.println(hs); 
	 */
	
	/*//contains returns boolean not inside data
	 * String a="abc"; String b="abc bbc";
	 * 
	 * System.out.println(a.contains(b));
	 */
	
	
	
	
	// in java 8  String s = "ABABCDCDUILCDAB"; 
	String st = "JJGGKKLLUITJJ";
	char eachlet[]= st.toCharArray();
	Stream.of(eachlet).distinct().forEach(System.out::println);
}
}
