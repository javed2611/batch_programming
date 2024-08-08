// WAP to find the product of all the prime numbers in the array.
package arrayprogramming;
public class P6 {
	public static void main(String[] args) {
		int[] a = { 7, 11, 4, 5, 2, 1 }; 
		int product = 1;
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])) {
				product = product * a[i];
			}
		}
		System.out.println(product);
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
