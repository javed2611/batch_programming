// WAP to find the sum of each row of the matrix.
package arrayprogram;

public class P23 {
	public static void main(String[] args) {
		int[][] a = {{1,2,3} , {4,5,6} , {7,8,9}};
		
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				sum = sum + a[i][j];
			}
			System.out.println(sum);
		}
	}
}
