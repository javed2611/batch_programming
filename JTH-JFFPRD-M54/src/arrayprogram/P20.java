package arrayprogram;

public class P20 {
	public static void main(String[] args) {
		int[] a = {-1, 0, 1, 2, -1, -4};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				for (int k = j+1; k < a.length; k++) {
					if (a[i]+a[j] +a[k] == 0) {
						System.out.println(a[i]+" "+a[j]+" "
					+a[k]);
					}
				}
			}
		}
	}
}
