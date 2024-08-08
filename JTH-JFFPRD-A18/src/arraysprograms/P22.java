package arraysprograms;

public class P22 {
	public static void main(String[] args) {
		int[] a = {2,3,10,6,4,8,1};
//		int[] a = { 7, 9, 5, 6, 3, 2 };
		int maxDiff = 0;
		int x = 0, y = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] - a[i] > maxDiff) {
					maxDiff = a[j] - a[i];
					x = a[i];
					y = a[j];
				}
			}
		}
		System.out.println(maxDiff);
		System.out.println(x);
		System.out.println(y);
	}
}
