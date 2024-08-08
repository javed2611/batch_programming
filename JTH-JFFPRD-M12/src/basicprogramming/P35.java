// WAP to count the total number of digits.
package basicprogramming;
import java.util.Scanner;
public class P35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		while (n != 0) {
			count++;
			n = n / 10;
		}
		System.out.println(count);
	}
}
