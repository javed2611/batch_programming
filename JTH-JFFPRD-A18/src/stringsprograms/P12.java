package stringsprograms;

public class P12 {
	public static void main(String[] args) {
		String s = "icecream";
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i]!='a'&&c[i]!='e'&&c[i]!='i'&&c[i]!='o'&&c[i]!='u') 
			{
				c[i] = '#';
			}
		}
		String res = new String(c);
		System.out.println(res);
	}
}
