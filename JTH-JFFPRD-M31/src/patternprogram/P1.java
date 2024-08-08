package patternprogram;

public class P1 {
	public static void main(String[] args) {
		int n = 5; // no of rows and cols
		char ch = 'E';
		char x = ch;
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				if (r+c<=n+1) {
					System.out.print(ch + " ");
				} else {
					System.out.print(++x + " ");
				}
			}
			x = --ch;
			System.out.println();
		}
	}
}
