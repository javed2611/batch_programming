package stringprograms;
import java.util.Stack;
public class P11 {
	public static void main(String[] args) {
		String s = "()]{[]}";
		char[] ch = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]== '{' || ch[i] =='(' ||ch[i] == '[') {
				stack.push(ch[i]);
				continue;
			}
			
			if (stack.isEmpty()) {
				System.out.println("Not Balanced");
				return;
			}
			
			char pop = stack.pop();
			switch (pop)
			{
			case '[':
				if (ch[i] == '}' || ch[i] == ')') {
					System.out.println("Not balanced Bracket");
					return;
				}
				break;
			case '(':
				if (ch[i] == '}' || ch[i] == ']') {
					System.out.println("Not balanced Bracket");
					return;
				}
				break;
			case '{': 
				if (ch[i] == ']' || ch[i] == ')') {
					System.out.println("Not balanced Bracket");
					return;
				}
				break;
			}
		}
		if (stack.isEmpty()) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}
	}
}
