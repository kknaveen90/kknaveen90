package prorgrams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class ListofStringsDuplicatestrings { 
	public static void main(String[] args) {
		List<String> stList = Arrays.asList("abc", "bca", "xyz", "zxy", "abcd", "ddc", "dcd");
		HashSet<String> hs = new HashSet<String>();
		TreeSet<String> duplicateshs = new TreeSet<String>(); //sorted

		/*
		 * 1. lopp each string and 
		 * 2. get eachletter from string and sort with char[].sort()
		 * 
		 * 3. list.sort() - sorts eintere list 4. hashset - if already present andd
		 * repeated string in new hashset
		 */
		char[] eachCharofString = null;
		String resString = null;
		for (String eachString : stList) { // abc
			eachCharofString = eachString.toCharArray(); // a b c
			Arrays.sort(eachCharofString); // a b c
			resString = String.valueOf(eachCharofString);// abc
			  if(!hs.contains(resString))
				  hs.add(resString);
			  else 
				  duplicateshs.add(resString); 

		}
		hs.stream().forEach(System.out::println);
	}

	

}
