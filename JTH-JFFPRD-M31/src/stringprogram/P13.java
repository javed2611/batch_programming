// WAP to reverse the position to words without reversing the 
// characters
package stringprogram;
public class P13 {
	public static void main(String[] args) {
		String s = "java is programming lang";
		String[] a = s.split(" ");
		for (int i = a.length - 1;i>=0;i--) {
			System.out.print(a[i] + " ");
		}
	}
}
