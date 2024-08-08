// WAP to find the average value of the array.
package arrayprogramming;

public class P17 {
	public static void main(String[] args) {
		int[] a = {3,1,6,7,2};
		float sum = 0.0F;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		float avg = sum / a.length;
		System.out.println(avg);
	}
}