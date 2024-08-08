// WAP to find the sum of all the numbers of each array 
// in 2D array
package arraysprograms;

public class P28 {
	public static void main(String[] args) {
		int[][] a = {{10,20,30},{1,2,3,4},{11,22,33,44,55}};
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				sum = sum + a[i][j];
			}
			System.out.println(sum);
		}
	}
}
