/**
 * 
 */
package org.java.algo;

/**
 * @author shantanu
 * @date 08-May-2019 7:54:31 pm
 */
public class StringDigitCheckApp {
    public static boolean isDigit(String word) {
	if (word.isEmpty()) {
	    return false;
	}
	for (int i = 0; i < word.length(); i++) {
	    char temp = (char) (word.charAt(i) - '0');
	    if (temp < 0 || 9 < temp) {
		return false;
	    }
	}
	return true;
    }

}
