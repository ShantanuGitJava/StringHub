/**
 * 
 */
package org.java.algo;

/**
 * @author shantanu
 * @date 07-May-2019 10:36:36 am
 */
public class StringPermutationsApp {
    /**
     * @param word
     */
    public static void permutation(String word) {
	permutation("", word);
    }

    /**
     * @param perm
     * @param word
     */
    private static void permutation(String perm, String word) {
	if (word.isEmpty()) {
	    System.out.println(perm + word);
	} else {
	    for (int i = 0; i < word.length(); i++) {
		permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1));
	    }
	}

    }
}
