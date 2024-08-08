package garbageCollection; // Destructor
public class P1 {
	public static void main(String[] args) {
		System.out.println(new P1());
		P1 ref = new P1();
		ref = null;
		P1 ref1 = new P1();
		P1 ref2 = new P1();
		ref1 = ref2;
		System.gc();
	}
	@Override
	protected void finalize() {
		System.out.println("CleanUp Activity");
	}
}
