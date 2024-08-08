package basicprogramming;

public class P9 {
	public static void main(String[] args) {
		int a = 6, b = 8, gcd = 1;
		for(int i = 1;i<=a;i++)
		{
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		int lcm = (a * b) / gcd;
		System.out.println(lcm);
	}
}
