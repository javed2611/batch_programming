// WAP to find sum of all the odd numbers in the range 1-10
public class P9 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++)
		{
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
