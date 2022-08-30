package prorgrams;

//Java program to count all
//duplicates from string using
//hashing

public class countDuplicatesandPrintcountandduplicatechar {

	/* Print duplicates present
	in the passed string */
	
	// Driver Method
	public static void main(String[] args)
	{
		String str = "test string";
		
		// Create an array of size
				// 256 and fill count of
				// every character in it
				int count[] = new int[256];
				
				for (int i = 0; i < str.length(); i++)
					count[str.charAt(i)]++;
				

				for (int i = 0; i < 256; i++)
					if (count[i] > 1)
						System.out.println((char)(i) +
								", count = " + count[i]);
	}
}
