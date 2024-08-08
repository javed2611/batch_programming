package arraysprograms;

public class P35 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = { { 3, 1, 0 }, { 1, 3, 1 }, { 2, 1, 0 } };
		int[][] c = new int[3][3];
		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c.length; col++) {
				int sum = 0;
				for (int ele = 0; ele < c.length; ele++) {
					sum = sum + a[row][ele] * b[ele][col];
				}
				c[row][col] = sum;
			}
		}
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
