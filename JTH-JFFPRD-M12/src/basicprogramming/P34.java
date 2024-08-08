package basicprogramming;

public class P34 {
	public static void main(String[] args) {
		int n = 7, p = 2;
		int res = 1;
		for (int i = 1; i <= p; i++) {
			res = res * n;
		}
		System.out.println(res);
	}
}
