// WAP to swap 2 string using 3rd variable
package stringprogramming;
public class P18 {
	public static void main(String[] args) {
		String a = "hello";
		String b = "world";
		System.out.println("Before Swapping");
		System.out.println("a - " + a);
		System.out.println("b - " + b);
		String temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping");
		System.out.println("a - " + a);
		System.out.println("b - " + b);

	}
}
