// WAP to find the sum of diagonals of the matrix where if the element of
// the secondary diagonal is present at primary diagonal then the elements
// should not be added twice.
package arrayprogram;
public class P29 {
	public static void main(String[] args) {
		int[][] a = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j) {
					sum = sum + a[i][j];
				} else if (i + j == a.length - 1) {
					sum = sum + a[i][j];
				}
			}
		}
		System.out.println(sum);
	}
}
