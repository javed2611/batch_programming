// WAP to find the prod of all the even numbers in 
// the range 1-10
public class P10 {
	public static void main(String[] args) {
		int prod = 1;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				prod = prod * i;
			}
		}
		System.out.println(prod);
	}
}
