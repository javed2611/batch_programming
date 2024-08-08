import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		for (int i = 0; i < b.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		int alice = 0;
		int bob = 0;
		for (int i = 0; i < b.length; i++) {
			if (a[i] > b[i]) {
				alice++;
			} else if (a[i] < b[i]) {
				bob++;
			}
		}
		System.out.println(alice + " " + bob);
	}
}
