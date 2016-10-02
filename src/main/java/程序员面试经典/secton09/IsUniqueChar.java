package 程序员面试经典.secton09;

import java.util.*;

public class IsUniqueChar {
	
	public static boolean isUniqueChar(String str){
		if(str.length() > 256)
			return false;
		boolean[] charSet = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if(charSet[val]){
				return false;
			}
			charSet[val] = true;
		}
		return true;
	}
	


}
