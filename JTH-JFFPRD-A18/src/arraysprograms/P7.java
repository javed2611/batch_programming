package arraysprograms;

public class P7 {
	public static void main(String[] args) {
		int[] a = {9,6,4,2,3,5,7,0,1};
		int n = a.length;
		int sum1 = n * (n + 1) / 2;
		int sum2 = 0;
		for (int i = 0; i < a.length; i++) {
			sum2 = sum2 + a[i];
		}
		System.out.println(sum1 - sum2);
	}
}
