package basicprogramming;
import java.math.BigInteger;
import java.util.Scanner;
public class P19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger fact = BigInteger.valueOf(1);
		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);
	}
}
