package 程序员面试经典.secton09;

public class Solution_1_6 {
	public static void rotate(int[][] matrix, int n) {
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i];

				// left -- > top
				matrix[first][i] = matrix[last - offset][first];

				// down --> left
				matrix[last - offset][first] = matrix[last][last - offset];

				// right --> down
				matrix[last][last - offset] = matrix[i][last];

				// top --> right
				matrix[i][last] = top;

			}
		}
	}
}
