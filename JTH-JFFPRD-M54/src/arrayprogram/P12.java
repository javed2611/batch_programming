package arrayprogram;

public class P12 {
	public static void main(String[] args) {
		int[]a = {5,9,12,16,25};
		int k = 6;
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total = total + (a[i] % k);
		}
		System.out.println(total);
	}
}
