/**
 * 
 */
package org.java.algo;

/**
 * @author shantanu
 * @date 07-May-2019 9:58:03 am
 */
public class AnagramStringCheckApp {
    public static boolean checkAnagram(String word, String anagram) {
	if (word.length() != anagram.length()) {
	    return false;
	}
	char[] characters = word.toLowerCase().toCharArray();
	//foreach loop
	for (char ch : characters) {
	    int index = anagram.toLowerCase().indexOf(ch);
	    if (index != -1) {
		anagram = anagram.substring(0, index) + anagram.substring(index + 1);
	    } else {
		return false;
	    }
	}
	return true;
    }

}
