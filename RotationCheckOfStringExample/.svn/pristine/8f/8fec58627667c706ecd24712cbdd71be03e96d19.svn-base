/**
 * 
 */
package org.java.algo;

/**
 * @author shantanu
 * @date 17-May-2019 12:09:35 pm
 */
public class StringPalindromeCheckApp {

    /**
     * input : String,string || output : boolean || function : take two string,
     * reverse one string and check will it be the equal of the 2nd one if yes then
     * return true else return false
     * 
     * @param word_1
     * @return boolean
     */
    public static boolean isPalindrome(String word_1, String word_2) {
	if (word_1.length() != word_2.length()) {
	    return false;
	}
	return word_2.equals(reverse(word_1)) ? true : false;
    }

    /**
     * input : string || output : string || function : take one string and reverse
     * it and return that reverse string
     * 
     * @param word_1
     * @return RevTemp
     */
    private static String reverse(String word_1) {
	String RevTemp = "";
	for (int i = word_1.length() - 1; i >= 0; i--) {
	    RevTemp = RevTemp + word_1.charAt(i);
	}
	return RevTemp;
    }

}
