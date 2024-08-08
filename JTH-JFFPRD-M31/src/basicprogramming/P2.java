// WAP to find the sum of all the numbers in the given range 1-5;
package basicprogramming;
public class P2 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
