package collectionprogram;

public class P2 {
	public static void main(String[] args) {
		Integer a = Integer.valueOf(10);
		Integer b = Integer.valueOf(20);
		
//		System.out.println(a + b);
		
		int i = a.intValue(); // Unboxing
		long j = b.longValue(); // Unboxing
		System.out.println(i + j);
	}
}
