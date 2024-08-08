// WAP to swap two string values using 3rd variable
package stringprogram;

public class P20 {
	public static void main(String[] args) {
		String s1 = "amaan";
		String s2 = "developer";
		System.out.println("Before Swapping");
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		String temp = s1;
		s1 = s2;
		s2 = temp;
		System.out.println("After Swapping");
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
	}
}
