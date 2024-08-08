package arrayprogramming;
public class P18 {
	public static void main(String[] args) {
		int[] a = { 40, 18, 36, 12 };
		int x = 12;
		int index = -1;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (x == a[i]) {
				flag = true;
				index = i;
				break;
			}
		}
		if (flag) {
			System.out.println("Present at " + index);
		} else {
			System.out.println("not present");
		}
	}
}
