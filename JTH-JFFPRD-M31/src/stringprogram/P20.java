// WAP swap two string without using 3rd variable.
package stringprogram;
public class P20 {
	public static void main(String[] args) {
		String a = "orange";
		String b = "sunday";
		System.out.println("Before Swapping");
		System.out.println("a - " + a);
		System.out.println("b - " + b);
		a = a.concat(b);
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("After Swapping");
		System.out.println("a - " + a);
		System.out.println("b - " + b);
	}
}
