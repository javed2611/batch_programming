// WAP to print the sum of all odd elements from each 
// array in 2D array
package arraysprograms;
public class P30 {
	public static void main(String[] args) {
		int[][] a = { { 4, 3, 1 }, { 7, 5, 2 }, { 9, 2, 2 } };
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] % 2 != 0) {
					sum = sum + a[i][j];
				}
			}
			System.out.println(sum);
		}
	}
}
