// Decimal --> Hexadecimal
package numberprogramming;
public class P3 {
	public static void main(String[] args) {
		int n = 12;
		String hex = "";
		while (n != 0) {
			int rem = n % 16;
			if (rem == 10) {
				hex = "A" + hex;
			} else if (rem == 11) {
				hex = "B" + hex;
			} else if (rem == 12) {
				hex = "C" + hex;
			} else if (rem == 13) {
				hex = "D" + hex;
			} else if (rem == 14) {
				hex = "E" + hex;
			} else if (rem == 15) {
				hex = "F" + hex;
			} else {
				hex = rem + hex;
			}
//			2nd Approach
//			if (rem > 9) {
//				hex = (char) (rem + 55) + hex;
//			} else {
//				hex = rem + hex;
//			}
			
			n = n / 16;
		}
		System.out.println(hex);
	}
}
