package stringprogram;

public class P16 {
	public static void main(String[] args) {
		String s = "aa abc@ sad$ hsagd^";
		int count  = 0;
		for(int i = 0;i<s.length();i++) {
			char ch = s.charAt(i);
			if (!(ch>='a'&&ch<='z') && !(ch>='0'&&ch<='9') && ch!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}