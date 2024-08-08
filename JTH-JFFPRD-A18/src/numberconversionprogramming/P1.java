package numberconversionprogramming;

public class P1 {
	public static void main(String[] args) {
		int n = 964475;
		int base = 16;
		String hex = "";
		while (n != 0) {
			int rem = n % base;
			switch (rem) {
			case 10:hex = "a" + hex;
				break;
			case 11:hex = "b" + hex;
				break;
			case 12:hex = "c" + hex;
				break;
			case 13:hex = "d" + hex;
				break;
			case 14:hex = "e" + hex;
				break;
			case 15:hex = "f" + hex;
				break;
			default:hex = rem + hex;
				break;
			}

			n = n / base;
		}
		System.out.println(hex);
	}
}
