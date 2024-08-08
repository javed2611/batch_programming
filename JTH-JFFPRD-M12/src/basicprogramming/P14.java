package basicprogramming;
import java.util.Scanner;
public class P14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int countOfPrimeNo = 1;
		int n = 2;
		while (countOfPrimeNo <= x) {
			int count = 0;
			for(int i = 1;i<=n;i++)
			{
				if (n % i == 0) {
					count++;
				}
			}
			if (count==2) {
				System.out.println(n);
				countOfPrimeNo++;
			}
			n++;
		}
	}
}
