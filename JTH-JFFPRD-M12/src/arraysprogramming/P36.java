package arraysprogramming;

public class P36 {
	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b = {{1,3,4},{8,1,1},{1,2,1}};
		int[][] c = new int[3][3];
		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c.length; col++) {
				int sum = 0;
				for (int element = 0; element < c.length; element++) {
					sum = sum + a[row][element] * b[element][col];
				}
				c[row][col] = sum;
			}
		}
		// to print array
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
