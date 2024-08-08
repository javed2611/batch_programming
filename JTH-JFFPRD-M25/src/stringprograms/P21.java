package stringprograms;
public class P21 {
	public static void main(String[] args) {
		String p = "";
		boolean isUpper = false, isLower = false, 
				isNumber = false, isSpecial = false;
		for(char ch : p.toCharArray())
		{
			if (ch>='A'&&ch<='Z') {
				isUpper = true;
			} else if (ch>='a'&&ch<='z') {
				isLower = true;
			} else if (ch>='0'&&ch<='9') {
				isNumber = true;
			} else {
				isSpecial = true;
			}
		}
		if (p.length()>=8&&isUpper&&isLower&&isNumber&&
				isSpecial&&!p.contains(" ")) {
			System.out.println("Strong Password");
		} else {
			System.out.println("Weak Password");
		}
	}
}






