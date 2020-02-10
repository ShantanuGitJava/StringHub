/**
 * 
 */
package org.java.algo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shantanu
 * @date 15-May-2019 11:02:55 am
 */
public class FindFirstNonRepeatedCharApp {

    /**
     * input : String || output : char || function : Find the first non-repeated
     * character from the given string and return it
     * 
     * @param word
     */
    public static char findFirstNonRepeatedChar(String word) {
	// created HashMap instance
	Map<Character, Integer> fnrcMap = new HashMap<Character, Integer>();
	// iterate given string by char array and keep it in created map with char : key
	// and no. occurrence : value
	for (char ch : word.toCharArray()) {
	    fnrcMap.put(ch, fnrcMap.containsKey(ch) ? fnrcMap.get(ch) + 1 : 1);
	} // for
	  // iterate the word again and find the first non-repeated char by using HashMap
	  // Object
	for (int i = 0; i < word.length(); i++) {
	    if (fnrcMap.get(word.charAt(i)) == 1) {
		return word.charAt(i);
	    } // if
	} // for
	throw new RuntimeException("Undefined behaviour");
    }// method
}// class
