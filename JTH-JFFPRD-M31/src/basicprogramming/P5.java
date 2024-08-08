// WAP to find the product of all odd numbers in the range 1-10;
package basicprogramming;

public class P5 {
	public static void main(String[] args) {
		int product  = 1;
		for(int i = 1;i<=10;i++)
		{
			if (i % 2 != 0) {
				product = product * i;
			}
		}
		System.out.println(product);
	}
}
