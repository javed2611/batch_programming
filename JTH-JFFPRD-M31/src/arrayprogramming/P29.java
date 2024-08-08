package arrayprogramming;

public class P29 {
	public static void main(String[] args) {
		int[][] a = {{10,20,30,40},{11,13,15},{100,200}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}
}
