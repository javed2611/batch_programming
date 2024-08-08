// WAP to check if the number is Niven or Harshad Number 
package basicprogramming;

public class P5 {
	public static void main(String[] args) {
		int n = 15;
		int temp = n;
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		if (temp % sum == 0) {
			System.out.println("Niven Number");
		} else {
			System.out.println("Not a Niven Number");
		}
	}
}
