// WAP to swap 2 string without using 3rd variable
package stringprogramming;
public class P19 {
	public static void main(String[] args) {
		String a = "maharashtra";
		String b = "goa";
		System.out.println("Before Swapping");
		System.out.println("a - " + a);
		System.out.println("b - " + b);
		a = a + b;
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("After Swapping");
		System.out.println("a - " + a);
		System.out.println("b - " + b);
	}
}
