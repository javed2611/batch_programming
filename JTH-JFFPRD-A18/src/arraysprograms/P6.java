// WAP to display all the prime numbers from the array
package arraysprograms;
public class P6 {
	public static void main(String[] args) {
		int[] a = { 7, 12, 5, 356, 4, 75, 147 };
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 1; j <= a[i]; j++) {
				if (a[i] % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(a[i]);
			}
		}
	}
}
