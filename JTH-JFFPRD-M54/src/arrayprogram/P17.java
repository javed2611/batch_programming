// WAP to print all the elements present in the 2D array.
package arrayprogram;

public class P17 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 2, 3, 5, 7 }, 
				{ 10, 20, 30 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}
}
