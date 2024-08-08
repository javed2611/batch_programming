// WAP to calculate the number raised to power result
public class P26 {
	public static void main(String[] args) {
		int number = 5, power = 3;
		int res = 1;
		for (int i = 1; i <= power; i++) {
			res = res * number;
		}
		System.out.println(res);
	}
}
