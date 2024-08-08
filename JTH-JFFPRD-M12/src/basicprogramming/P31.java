// WAP to check if the number is Strong Number.
package basicprogramming;
 
public class P31 {
	public static void main(String[] args) {
		int n = 145;
		int sum = 0, temp = n;
		while (n != 0) {
			int digit = n % 10;
			int fact = 1;
			for (int i = 1; i <= digit; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("It is a Strong Number");
		} else {
			System.out.println("It is not a Strong Number");
		}
	}
}
