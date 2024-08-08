package arrayprogramming;

public class P13 {
	public static void main(String[] args) {
		int[] a = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int n = a.length;
		int totalSum = n * (n + 1) / 2;
		
		int arraySum = 0;
		for (int i = 0; i < a.length; i++) {
			arraySum = arraySum + a[i];
		}
		int missing = totalSum - arraySum;
		System.out.println(missing);				
	}
}
