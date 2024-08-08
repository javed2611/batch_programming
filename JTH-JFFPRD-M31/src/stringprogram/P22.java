package stringprogram;

public class P22 {
	public static void main(String[] args) {
		String s1 = "xxhixxhixxxhixxx";
		String s2 = "hi";
		System.out.println(countHi(s1,s2));
	}
	
	public static int countHi(String s1,String s2) {
		if (s1.contains(s2)) {
			return 1 + countHi(s1.substring(s1.indexOf(s2)+s2.length()),s2);
		} else {
			return 0;
		}
	}
}
