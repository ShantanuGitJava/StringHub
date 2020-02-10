/**
 * 
 */
package org.java.algo;

import java.util.LinkedHashMap;

/**
 * @author shantanu
 * @date 21-May-2019 9:53:22 am
 */
public class LongestSubStringWithoutRepCharApp {

    /**
     * input : String || output : String || function : find the longest substring
     * without rep of char from the given string
     * 
     * @param word
     * @return LongestSubString
     */
    public static String longestSubStringWithoutRepChar(String word) {
	// initialize the method local variable
	String longestSubString = null;
	int longestSubStringLength = 0;
	// create the LinkedHashMap object to store the longest substring as it
	// preserved insertion order
	LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
	// iterate the word
	for (int i = 0; i < word.length(); i++) {
	    if (!lhm.containsKey(word.charAt(i))) {
		lhm.put(word.charAt(i), i);
	    } else {
		i = lhm.get(word.charAt(i));
		lhm.clear();
	    } // else
	    if (longestSubStringLength < lhm.size()) {
		longestSubStringLength = lhm.size();
		longestSubString = lhm.keySet().toString();
	    } // if
	} // for
	return longestSubString;
    }// longestSubStringWithoutRepChar

}// LongestSubStringWithoutRepCharApp
