package 程序员面试经典.secton09;

public class Solution_1_4 {
	public static void replaceSpace(char[] str, int length) {
		int spaceCount = 0;
		for (int i = 0; i < length; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		int newLength = length + spaceCount * 2;
		str[newLength] = '\0';
		for (int i = length - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[newLength - 1] = '0';
				str[newLength - 2] = '2';
				str[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				str[newLength - 1] = str[i];
				newLength = newLength - 1;
			}
		}
	}

}
