public class P1 {
	public static void main(String[] args) {
		Integer a = Integer.valueOf(100); // Boxing
		Integer b = 1; // Auto Boxing
		System.out.println("**** machha and machhi***");
		System.out.println(a + b); // Auto Unboxing
		
		int i = a.intValue(); //Unboxing
		int j = b.intValue(); //Unboxing
		System.out.println(i + j);
		
	}
}