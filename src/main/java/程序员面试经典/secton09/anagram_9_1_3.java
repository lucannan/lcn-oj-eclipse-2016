package 程序员面试经典.secton09;

import java.util.*;

public class anagram_9_1_3 {
	public static String sort(String str) {
		char[] content = str.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

	public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}

	public static boolean permulation2(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] letters = new int[256];
		char[] s_array = s.toCharArray();
		for(char c: s_array){
			letters[c] ++;
		}
		for (int i = 0; i < t.length(); i++) {
			int c = (int)t.charAt(i);
			if(--letters[c] < 0){
				return false;
			}
		}
		
		return true;
	}
}

class Dog {
	int size;

	public Dog(int size) {
		this.size = size;
	}
}

class DogComparator implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		return o1.size - o2.size;
	}

}
