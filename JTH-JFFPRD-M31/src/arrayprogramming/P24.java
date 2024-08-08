package arrayprogramming;

public class P24 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int target = 9;
		for (int i = 0; i < a.length - 2; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				for (int k = j + 1; k < a.length; k++) {
					if (a[i] + a[j] + a[k] == target) {
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
					}
				}
			}
		}
	}
}
