// WAP to find product of all the numbers in range 1-5.
// WAp to find factorial of 5.
package basicprogramming;

public class P7 {
	public static void main(String[] args) {
		int product = 1;
		for(int i = 1;i<=5;i++)
		{
			product = product * i;
		}
		System.out.println(product);
	}
}
