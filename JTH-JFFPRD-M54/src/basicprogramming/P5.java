package basicprogramming;

public class P5 {
	public static void print(int n) 
	{
		if (n > 0)
		{
			System.out.print(n + " ");
			print(n - 5);
		}
		System.out.print(n + " ");
	}

	public static void main(String[] args) {
		print(16);
	}
}
