// WAP to print the number from the array which has
// maximum 1's in its binary equivalent.
package arraysprograms;
public class P5 {
	public static void main(String[] args) {
		int[] a = { 4, 2, 5, 7, 9, 6, 21 };
		int maxCount = 0; // store max count of 1's in binary
		int max = 0; // store the number which has maximum 1's in binary
		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			int count = 0;
			while (n != 0) {
				int rem = n % 2;
				if (rem == 1) {
					count++;
				}
				n = n / 2;
			}
			if (count > maxCount) {
				maxCount = count;
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
