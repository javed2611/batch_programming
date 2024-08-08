package arraysprogramming;

public class P27 {
	public static void main(String[] args) {
		int[][] a = {{10,20,30,40},{1,5,7,9},{2,4,6,8,10}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}
}
