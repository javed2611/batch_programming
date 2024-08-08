public class P25 {
	public static void main(String[] args) {
		int[] a = { 0, 1, 4, 1, 0 };
		boolean isPalindrome = true;
		int i = 0, j = a.length - 1;
		while (i < j) {
			if (a[i] != a[j]) {
				isPalindrome = false;
				break;
			}
			i++;
			j--;
		}
		if (isPalindrome) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
}
