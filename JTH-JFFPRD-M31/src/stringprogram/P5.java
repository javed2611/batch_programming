package stringprogram;
public class P5 {
	public static void main(String[] args) {
		String s = "madam";
		boolean isPalindrome = true;
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
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
