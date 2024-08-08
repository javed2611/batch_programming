package objectclass;
public class P1 {
	public static void main(String[] args) {
		System.out.println(new P1()); // Anonymous Object
		System.gc();
	}
	@Override
	public void finalize() {
		System.out.println("cleanup activity");
	}
}