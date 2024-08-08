package arraysprogramming;
public class P11 {
	public static void main(String[] args) {
		int[] a = {9,8,4,5,3,6,7,0,1};
		int n = a.length;
		int sumN = n * (n+1) / 2;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sumN - sum);
	}
}