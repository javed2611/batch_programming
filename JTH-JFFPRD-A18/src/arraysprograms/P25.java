package arraysprograms;

public class P25 {
	public static void main(String[] args) {
		int[][] a = {{10,20,30},{1,2,3,4},{11,22,33,44,55}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}
}
