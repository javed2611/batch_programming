// WAP to swap two variables using 3rd variable
package basicprogramming;
public class P19 {
	public static void main(String[] args) {
		int a = 3;
		int b = 9;
		System.out.println("Before Swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}
}
