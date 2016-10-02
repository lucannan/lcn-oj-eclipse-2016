package 程序员面试经典.secton09;

public class Solution_1_5 {
	public static String compressBad(String str) {
		String myStr = "";
		char last = str.charAt(0);
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				myStr += last + "" + count;
				count = 1;
				last = str.charAt(i);
			}
		}

		return myStr + last + count;
	}

	public static String compressBetter(String str) {
		int size = countCompression(str);
		if (size >= str.length()) {
			return str;
		}

		StringBuilder sb = new StringBuilder();
		char last = str.charAt(0);
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				sb.append(last);
				sb.append(count);
				last = str.charAt(i);
				count = 1;
			}
		}

		sb.append(last);
		sb.append(count);
		return sb.toString();
	}

	public static int countCompression(String str) {
		if (str == null || str.isEmpty()) {
			return 0;
		}

		char last = str.charAt(0);
		int size = 0;
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				last = str.charAt(i);
				size += 1 + String.valueOf(count).length();
				count = 1;
			}
		}

		size += 1 + String.valueOf(count).length();
		return size;
	}
}
