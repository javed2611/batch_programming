// WAP to print the numbers from 1-5.
package basicprogramming;
public class P1 {
	public static void main(String[] args) {
		System.out.println("While Loop");
		int n = 1;
		while (n <= 5) {
			System.out.println(n);
			n++;
		}
		System.out.println("Do While Loop");
		int x = 1;
		do {
			System.out.println(x);
			x++;
		} while (x <= 5);
		System.out.println("For Loop");
		for (int z = 1; z <= 5; z++) {
			System.out.println(z);
		}

	}
}
