package prorgrams;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintDuplicatesInStringWithHashMap {
	
public static void main(String args[]) {
	String s = "hhhaabbjkbb";
	String r="";
	char eachChar[]= s.toCharArray();
	Map<Character,Integer> hm = new HashMap<Character,Integer>();
	//(h,1) (h,(1+1)  -same key h updating value 2 as it is repeated occurance
	// get(key) > 1 - character which value is >1 print 
	
	for (int i = 0; i < eachChar.length; i++) {
	
		if(!hm.containsKey(eachChar[i])) { // not present in map then add into map
			hm.put(eachChar[i],1); //h
		}
		
		else   //if already present in map 
			hm.put(eachChar[i], hm.get(eachChar[i]) +1 ); //h  increasing count by 1
	} 
	
	//to print all chars with count of each char in map
	System.out.println(hm);
	
	//to print keyvalues like a2b4h3j1k1a USE LInked Hashmpa to mintain insertion order
	//Map<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
	//Linked hasmap to maintain insersion order
	hm.entrySet().stream().forEach(x ->System.out.print(x.getKey()+""+x.getValue()));	
	
	
	
	//duplicates in string
	hm.entrySet().stream().filter( x-> (x.getValue())> 1).forEach(x ->System.out.println(x.getKey()));	
	
	//hm.entrySet().forEach((Map.Entry::getKey, Map.Entry::getValue) -> ); //Map.Entry::getKey, Map.Entry::getValue
	//hm.forEach((k,v) -> System.out.print( k + "" + v));
	
	
	
}


}
