/**
 * 
 */
package org.java.algo;

/**
 * @author shantanu
 * @date 09-May-2019 10:38:45 am
 */
public class StringVowelCheckApp {
    public static int vowelCounter(String word) {
	if (word.isEmpty()) {
	    return 0;
	}
	char[] wordArray = word.toLowerCase().toCharArray();
	int vowelCount = 0;
	for (char c : wordArray) {
	    switch (c) {
	    case 'a':
	    case 'e':
	    case 'i':
	    case 'o':
	    case 'u':
		vowelCount++;
		break;

	    default:
	    }
	}
	return vowelCount;
    }

    public static void checkVowelConsonantCounter(String word) {
	if (null == word || "".equals(word.trim())) {
	    System.err.println("Enter the Correct Word");
	}
	int vowelCount = 0;
	int consonantsCount = 0;
	String temp = "aeiouAEIOU";
	char[] wordArray = word.toCharArray();
	for (char ch : wordArray) {
	    int unicode = ch;
	    if ((unicode <= 90 && unicode >= 65) || (unicode <= 122 && unicode >= 97)) {
		if (temp.contains(ch + "")) {
		    vowelCount++;
		} else {
		    consonantsCount++;
		}
	    } else {
		continue;
	    }
	}
	System.out.println("Vowels in the given word [" + word + "] is : " + vowelCount);
	System.out.println("Consonants in the given word [" + word + "] is : " + consonantsCount);
    }

}
