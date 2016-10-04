package 剑指offer;

public class Test03 {
	
	public static boolean findNum(int[][] matrix, int num){
		if(matrix == null || matrix.length < 1 || matrix[0].length < 1){
			return false;
		}
		int rows = matrix.length;
		int cols = matrix[0].length;
		int row = 0;
		int col = cols - 1;
		
		while(row >= 0 && row <= rows && col >=0 && col <= cols){
			if(matrix[row][col] == num){
				return true;
			}else if(matrix[row][col] > num){
				col--;
			}else{
				row++;
			}
		}
		
		return false;
	}

}
