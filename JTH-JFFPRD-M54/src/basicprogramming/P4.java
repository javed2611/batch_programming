// WAP to print all the number from 500-1 without using any loop
package basicprogramming;

public class P4 {
	public static void print(int n) {
		if (n >= 1) // Base Condition
		{
			System.out.println(n);
			n--;
			print(n);
		}
	}
	public static void main(String[] args) {
		print(500);
	}
}
