package prorgrams;

import java.util.HashSet;
import java.util.StringJoiner;
import java.util.function.ToLongBiFunction;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class NonRepeatedInString {
	
public static void main(String args[]) {
	String s = "hhaabbjkbb";
	String r="";
	char eachChar[]= s.toCharArray();
	HashSet<Character> hs = new HashSet<Character>();
	HashSet<Character> hs2 = new HashSet<Character>();
	
	for( int i=0; i<eachChar.length; i++) {
		if(!hs.contains(eachChar[i])){ // firstoccurances
			hs.add(eachChar[i]); 		//habjk
			}
		else   							// repeated occurences
			if(!hs2.contains(eachChar[i])){ 
				hs2.add(eachChar[i]); //hab 
				}
		
	}
 
  hs.removeAll(hs2); // only one-occurance //jk
  hs.forEach(System.out::print); 
  
 
}
	
}
