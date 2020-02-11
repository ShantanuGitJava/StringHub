/**
 * 
 */
package org.java.algo;

/**
 * @author shantanu
 *
 */
public class StringReverseApp {
	public static String reverse(String word) {
		String ReverseWord = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			ReverseWord = ReverseWord + word.charAt(i);
		}
		return ReverseWord;
	}

	public static String reverseSentence(String statement) {
		String ReverseStatment = "";
		String[] strArray = statement.split(" ");
		for (int i = 0; i < strArray.length; i++) {
			ReverseStatment = ReverseStatment + " " + reverse(strArray[i]);
		}
		return ReverseStatment;
	}

}
