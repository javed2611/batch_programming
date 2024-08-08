package arraysprogramming;

public class P22 {
	public static void main(String[] args) {
		int[] a = { 8, 7, 4, 3, 5, 2 };
		for (int i = 0; i < a.length; i++) {
			boolean isLeader = true;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					isLeader = false;
					break;
				}
			}
			if (isLeader) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
