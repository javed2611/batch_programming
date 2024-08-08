// WAP to swap 2 numbers using 3rd variable
public class P19 {
	public static void main(String[] args) {
		int a = 6;
		int b = 2;
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
