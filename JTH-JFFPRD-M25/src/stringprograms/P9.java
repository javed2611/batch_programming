// WAP to swap 2 string using 3rd variable
package stringprograms;
public class P9 {
	public static void main(String[] args) {
		String a = "hello";
		String b = "world";
		System.out.println("Before Swapping");
		System.out.println("a - " + a);
		System.out.println("b - " + b);
		String c = a;
		a = b;
		b = c;
		System.out.println("After Swapping");
		System.out.println("a - " + a);
		System.out.println("b - " + b);
	}
}
