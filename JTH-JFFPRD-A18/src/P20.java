// WAP to swap 2 variable without using 3rd variable
public class P20 {
	public static void main(String[] args) {
		int a = 3;
		int b = 9;
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
