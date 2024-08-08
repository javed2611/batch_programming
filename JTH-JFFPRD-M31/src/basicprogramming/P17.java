// WAP to swap 2 numbers with using 3rd variable
package basicprogramming;
public class P17 {
	public static void main(String[] args) {
		int a = 15, b = 5;
		System.out.println("Before Swapping");
		System.out.println("a - " + a);
		System.out.println("b - " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("After Swapping");
		System.out.println("a - " + a);
		System.out.println("b - " + b);
	}
}
