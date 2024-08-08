package arraysprograms;

public class P21 {
	public static void main(String[] args) {
		int[] a = {1,3,2,4,5};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		int avg = sum / a.length;
		int count  = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == avg) {
				count++;
			}
		}
		System.out.println(count);
	}
}
