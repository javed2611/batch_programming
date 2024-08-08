import java.util.Scanner;
public class P21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base1 = sc.nextInt();
		int height1 = sc.nextInt();
		int base2 = sc.nextInt();
		int height2 = sc.nextInt();
		double area1 = (base1 * height1) / 2;
		double area2 = (base2 * height2) / 2;
		System.out.println(area1>area2?area1:area2);
	}
}
