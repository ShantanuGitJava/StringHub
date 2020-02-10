/**
 * 
 */
package org.java.algo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author shantanu
 *
 */
public class FindDuplicateCharactersApp {
	public static void printDuplicateCharacters(String word) {
		char[] charArrayWord = word.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(Character ch: charArrayWord) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);
			}
		}
		Set<Character> charSet=charMap.keySet();
		System.out.println("Duplicate Characters in "+word);
		for(Character set:charSet) {
			if (charMap.get(set)>1) {
				System.out.println(set+":"+charMap.get(set));
			}
		}
	}

}
