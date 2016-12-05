/**
 *
 * Name :		Lang, Wesley
 * Task :		151. Reverse Words in a String
 * Date : 		December 1, 2016
 * Course : 	LeetCode - Algorithms - Medium
 * Description: Given an input string, reverse the string word by word.
 * 
 */	

public class ReverseWord {
	
	public static void main(String [] args){
		String sub = "Thisssss isssss       my test sentence.";
		
		System.out.println(reverseWords(sub));

      }
	
	public static String reverseWords(String s) {
	    StringBuilder res = new StringBuilder();
	    for (int start = s.length() - 1; start >= 0; start--) { //for loop starting from opposite end
	        if (s.charAt(start) == ' ') { //if value at start is space continue loop
	        	continue;
	        }
	        int end = start; 
	        
	        
	        while (start >= 0 && s.charAt(start) != ' ') { //
	        	start--;
	        }
	        
	        res.append(s.substring(start + 1, end + 1)).append(" ");
	        
	    }
	    return res.toString().trim();
	}
}
