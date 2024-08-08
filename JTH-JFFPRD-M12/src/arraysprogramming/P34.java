package arraysprogramming;

public class P34 {
	public static void main(String[] args) {
		int[][] a = { { 100, 198, 333, 323 }, { 122, 232, 221, 111 }, { 223, 565, 245, 764 } };
		for (int i = 0; i < a.length; i++) {
			int large = Integer.MIN_VALUE;
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > large) {
					large = a[i][j];
				}
			}
			System.out.println(large);
		}
	}
}
