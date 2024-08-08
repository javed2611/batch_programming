// WAP to find the average of the array.
package arraysprograms;

public class P18 {
	public static void main(String[] args) {
		int[] a = {4,5,1,2,7};
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum / a.length);
	}
}
