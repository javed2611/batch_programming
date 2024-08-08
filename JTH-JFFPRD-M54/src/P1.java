public class P1 {
	int i = 4;
	public static void main(String[] args) {
		System.out.println(new P1()); // Anonymous Object
		P1 ref = new P1();
		ref = null; // Nullify object reference
		P1 ref1 = new P1();
		P1 ref2 = new P1();
		ref1 = ref2; // Assinging ref of one reference var into other
		System.gc();
	}

	public void finalize() {
		System.out.println("Cleanup activity");
	}
}
