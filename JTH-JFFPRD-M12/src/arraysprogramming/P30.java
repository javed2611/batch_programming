package arraysprogramming;

public class P30 {
	public static void main(String[] args) {
		int[] a = {4,2,1,8,6,36};
		int maxGcd = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				int gcd = gcd(a[i], a[j]);
				if (gcd > maxGcd) {
					maxGcd = gcd;
				}
			}
		}
		System.out.println(maxGcd);
		
	}
	public static int gcd(int a, int b) {
		int gcd = 0;
		for(int i = 1;i<=a&&i<=b;i++)
		{
			if (a % i == 0 && b % i ==0) {
				gcd = i;
			}
		}
		return gcd;
	}
}
