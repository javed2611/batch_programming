// WAP to print all the palindrome numbers in the array
package arraysprograms;

public class P11 {
	public static void main(String[] args) {
		int[] a= {45,11,27,88,64,121,111};
		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			int rev = 0;
			while (n != 0)
			{
				int digit = n % 10;
				rev = rev * 10 + digit;
				n = n / 10;
			}
			if (a[i] == rev) {
				System.out.println(a[i]);
			}
		}
	}
}
