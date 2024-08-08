package basicprogramming;

public class P29 {
	public static void main(String[] args) {
		int n = 2514795;
		int sumOfEven = 0, sumOfOdd = 0;
		while (n != 0) {
			int digit =  n % 10;
			if (digit % 2 == 0) {
				sumOfEven = sumOfEven + digit;
			} else {
				sumOfOdd = sumOfOdd + digit;
			}
			n = n / 10;
		}
		System.out.println(sumOfEven * sumOfOdd);
	}
}
