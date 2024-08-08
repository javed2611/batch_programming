package stringsprograms;
public class P20 {
	public static void main(String[] args) {
		String s = "Java is a programming language java is high level programming language";
		String[] a = s.split(" ");
		int totalCount = 0;
		boolean[] b = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i+1; j < a.length; j++) {
					if (a[i].equalsIgnoreCase(a[j])) {
						count++;
						b[j] = true;
					}
				}
				if (count > 1) {
					System.out.println(a[i]);
					totalCount++;
				}
			}
		}
		System.out.println(totalCount);
	}
}
