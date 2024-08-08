package stringprogram;

public class P5 {
	public static void main(String[] args) {
		String s = "aa a bc@ sad$ hs.agd^";
		int miss = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!(ch >= 'a' && ch <= 'z') && !(ch >= 'A' && ch <= 'Z')
					&& !(ch >= '0' && ch <= '9') && ch != ' ') {
				miss++;
			}
		}
		System.out.println(miss);
	}
}
