/**
 *
 * Name :		Lang, Wesley
 * Task :		Reverse Words in a String
 * Date : 		December 1, 2016
 * Course : 	LeetCode - Algorithms - Easy
 * Description: Given an input string, reverse the string word by word.
 * 
 */	

public class ReverseString {
	
	public static void main(String [] args){
		String sub = "This is my test string";
		System.out.println(reverseString(sub));
	}

    public static String reverseString(String s) {
    	
    	if(s == null || s.length() == 0){
    		return "";
    	}

    	int j = s.length()-1;
        char [] toArray = s.toCharArray();
        
        for(int i = 0; i <= j; i++, j--){

            char temp = toArray[i];
            toArray[i] = toArray[j];
            toArray[j] = temp;

        }
       return new String(toArray);
    }
    
}
