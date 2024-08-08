package arraysprograms;

public class P14 {
	public static void main(String[] args) {
		int[] a  = {9,5,12,25,16};
		int k = 6;
		int sum = 0; 
		for (int i = 0; i < a.length; i++) {
			sum = sum + (a[i] % k);
		}
		System.out.println(sum);
	}
}
