// WAP to find the largest number from each row of the matrix.
package arrayprogram;

public class P24 {
	public static void main(String[] args) {
		int[][] a = {{32,14,21} , {65,187} , {91,25,678,32}};
		for (int i = 0; i < a.length; i++) {
			int largest = Integer.MIN_VALUE;
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > largest) {
					largest = a[i][j];
				}
			}
			System.out.println(largest);
		}
	}
}
