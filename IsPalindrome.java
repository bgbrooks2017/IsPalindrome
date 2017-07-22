package main;


public class IsPalindrome {
	
	public static void main(String[] args){
		
//This simple palindrome checker ignores case when determining the status. 
//replace "Racecar" with any word you would like to check. 		
		
		String word = "Racecar";
		System.out.print(word);
		//converts input all to lowercase and to an array
		char[] wordArray = word.toLowerCase().toCharArray();
		System.out.println(checkPalindrome(wordArray));
		
	}
	
	
	//Checks the first and last characters are equivalent and 
	//works its way to the center of the array.
	public static String checkPalindrome(char[] wordArray){
	
		int len1 = 0;
		int len2 = wordArray.length-1;
		while(len1<len2){
			if (wordArray[len1]!= wordArray[len2]){
				String result = " is NOT a Palindrome.";
				return result;
			}
			len1++;
			len2--;
		}
		String result = " IS a Palindrome!";
		return result;
	}

}
