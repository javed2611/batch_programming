// WAP to swap 2 numbers without using 3rd variable
package basicprogramming;

public class P20 {
	public static void main(String[] args) {
		int x = 7;
		int y = 1;
		System.out.println("Before Swapping");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swapping");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}
}
