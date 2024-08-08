package arraysprograms;

public class P31 {
	public static void main(String[] args) {
		int[][] a = { { 4, 3, 1 }, { 7, 5, 2 }, { 9, 2, 2 } };
		for (int i = 0; i < a.length; i++) {
			for (int j1 = 0,j2=a[i].length-1; j1 < a[i].length/2;
					j1++,j2--) 
			{
				int temp = a[i][j1];
				a[i][j1] = a[i][j2];
				a[i][j2] = temp;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}
}
