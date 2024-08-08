package stringprogram;
import java.util.Stack;
public class P17 {
	public static void main(String[] args) {
		String s = "{{}[()]}";
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if (stack.isEmpty()) {
				System.out.println("Invalid");
				return;
			} else {
				char pop = stack.pop();
				switch (pop) {
				case '(':
					if (s.charAt(i) == '}' || s.charAt(i) == ']') {
						System.out.println("Invalid");
						return;
					}
					break;
				case '[':
					if (s.charAt(i) == '}' || s.charAt(i) == ')') {
						System.out.println("Invalid");
						return;
					}
					break;
				case '{':
					if (s.charAt(i) == ')' || s.charAt(i) == ']') {
						System.out.println("Invalid");
						return;
					}
					break;
				}
			}
		}
		if (stack.isEmpty()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

	}
}
