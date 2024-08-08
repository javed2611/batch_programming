package basicprogramming;

public class P25 {
	public static void main(String[] args) {
		int n = 350;
		String hexa = "";
		while (n != 0) {
			int remainder = n % 16;
			if (remainder < 10) {
				hexa = remainder + hexa;
			} else {
				hexa = (char) (remainder + 55) + hexa;
			}
			n = n / 16;
		}
		System.out.println(hexa);
	}
}
