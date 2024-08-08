package arraysprograms;

public class P36 {
	public static void main(String[] args) {
		int[][] a = {{11,22,33},
					 {44,55,66},
					 {77,88,99}};
		int x = 55;
		int sum = 0; // sum of row no and col no
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == x) {
					sum = i + j;
					break;
				}
			}
		}
		int totalSum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (sum % 2 == 0 && a[i][j] % 2 == 0) {
					totalSum = totalSum + sumOfDigit(a[i][j]);
				} else if (sum % 2 != 0 && a[i][j] %2 != 0) {
					totalSum = totalSum + sumOfDigit(a[i][j]);
				}
			}
		}
		System.out.println(totalSum);
		
	}
	public static int sumOfDigit(int n)
	{
		int sum = 0;
		while (n != 0) {
			int d = n % 10;
			sum = sum + d;
			n = n / 10;
		}
		return sum;
	}
}
	
	
	
	
	
	








