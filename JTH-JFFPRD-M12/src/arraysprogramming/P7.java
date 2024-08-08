// WAP to find sum of all the prime numbers in the array.
package arraysprogramming;
public class P7 {
	public static void main(String[] args) {
		int[] a = { 7, 2, 5, 4, 1, 88, 66, 3, 4 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])) {
				sum = sum + a[i];
			}
		}
		System.out.println(sum);

	}

	public static boolean isPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count == 2;
	}
}
