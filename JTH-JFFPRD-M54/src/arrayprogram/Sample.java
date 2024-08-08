// WAP to swap two numbers using third variable
package arrayprogram;
public class Sample {
	public static void main(String[] args) {
		int a = 5, b = 7;
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