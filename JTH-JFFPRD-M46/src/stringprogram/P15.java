package stringprogram;
//Input - my name is amruta
//Output - amruta is name my
public class P15 {
	public static void main(String[] args) {
		String s = "my name is amruta";
		String[] a = s.split(" ");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}
}
