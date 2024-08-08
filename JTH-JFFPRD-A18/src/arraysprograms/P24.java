package arraysprograms;
public class P24 {
	public static void main(String[] args) {
		int[] a = { 3, 2, 4 };
		int target = 6;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == target) {
					System.out.println(i);
					System.out.println(j);
					break;
				}
			}
		}
	}
}
