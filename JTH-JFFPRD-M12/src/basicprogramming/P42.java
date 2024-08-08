package basicprogramming;
public class P42 {
	public static void main(String[] args) {
		int n = 546541;
		String hex = "";
		while (n != 0) {
			int rem = n % 16;
			switch (rem) {
			case 10:
				hex = "A" + hex;
				break;
			case 11:
				hex = "B" + hex;
				break;
			case 12:
				hex = "C" + hex;
				break;
			case 13:
				hex = "D" + hex;
				break;
			case 14:
				hex = "E" + hex;
				break;
			case 15:
				hex = "F" + hex;
				break;
			default:
				hex = rem + hex;
				break;
			}

			n = n / 16;
		}
		System.out.println(hex);
	}
}
