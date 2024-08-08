// WAP to swap 2 variables without using 3rd variable
package basicprogramming;

public class P18 {
	public static void main(String[] args) {
		int a = 4, b = -7;
		System.out.println("Before Swapping");
		System.out.println("a - " + a);
		System.out.println("b - " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping");
		System.out.println("a - " + a);
		System.out.println("b - " + b);
	}
}
