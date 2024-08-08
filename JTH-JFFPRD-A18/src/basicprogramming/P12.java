// WAP to count the no of digits in the input.
package basicprogramming;
public class P12 {
	public static void main(String[] args) {
		int n = 764654;
		int count  = 0; // store the count of the digits
		while (n != 0) {
			n = n / 10;
			count++;
		}
		System.out.println(count);
	}
}
