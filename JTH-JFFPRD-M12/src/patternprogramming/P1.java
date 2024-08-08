package patternprogramming;
public class P1 {
	public static void main(String[] args) {
		int n = 5;
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n - r; c++) {
				System.out.print(" ");
			}
			int coff = 1;
			for (int c = 1; c <= n; c++) {
				if (r >= c) {
					System.out.print(coff + " ");
				}
				coff = coff * (r - c) / c;
			}
			System.out.println();
		}
	}
}
