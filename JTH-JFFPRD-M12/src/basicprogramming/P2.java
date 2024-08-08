// WAP to print all the numbers from 5-1 using all loops.
package basicprogramming;

public class P2 {
	public static void main(String[] args) {
		System.out.println("While Loop");
		int a = 5;
		while (a >= 1) {
			System.out.println(a);
			a--;
		}
		System.out.println("Do WHile Loop");
		int b = 5;
		do {
			System.out.println(b);
			b--;
		} while (b >= 1);
		System.out.println("For Loop");
		for (int c = 5; c >= 1; c--) {
			System.out.println(c);
		}

	}
}
