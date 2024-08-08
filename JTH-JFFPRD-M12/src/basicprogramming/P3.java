package basicprogramming;

public class P3 {
	public static void main(String[] args) {
		for(int i = 1;i<=50;i++)
		{
			if (i % 3 == 0) {
				continue; // Skip the iteration
			}
			if (i > 8) {
				break; // stop the loop
			}
			System.out.println(i);
		}
	}
}
