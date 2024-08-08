//Input - holi is on monday. monday is holiday
//Output - Holi Is On Monday. Monday Is Holiday
package stringprogram;
public class P19 {
	public static void main(String[] args) {
		String s = "holi is on Monday. monday is holiday";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			char[] c = a[i].toCharArray();
			if (Character.isLowerCase(c[0])) {
				c[0] = Character.toUpperCase(c[0]);
				a[i] = new String(c);
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
