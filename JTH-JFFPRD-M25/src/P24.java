// WAP to reverse the array.
public class P24 {
	public static void main(String[] args) {
		int[] a = { 5, 8, 3, 2, 4 };
		int i = 0;
		int j = a.length - 1;

		while (i < j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		}
	}
}
