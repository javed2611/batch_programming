// WAP to print the product of all the odd digits from 
// the number
package basicprogramming;

public class P4 {
	public static void main(String[] args) {
		int n = 9843;
		int prod = 1;
		while (n != 0) {
			int digit = n % 10;
			if (digit % 2 != 0) {
				prod = prod * digit;
			}
			n = n / 10;
		}
		System.out.println(prod);
	}
}
