package arrayprogramming;
import java.util.Arrays;
public class P12 {
	public static void main(String[] args) {
		int[] a = { 11, 22, 33, 22, 11 };
		int[] b = a.clone();
		int i = 0, j = a.length - 1;
		while (i < a.length / 2) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		if (Arrays.equals(a, b)) {
			System.out.println("Array is a Palindrome");
		} else {
			System.out.println("Array is not a Palindrome");
		}
		
	}
}
