package basicprogramming;
import java.util.Scanner;
public class P17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base1 = sc.nextInt();
		int height1 = sc.nextInt();
		int base2 = sc.nextInt();
		int height2 = sc.nextInt();
		float A1 = (base1 * height1) / 2;
		float A2 = (base2 * height2) / 2;
		System.out.println(A1 > A2 ? A1 : A2);
	}
}
