package collectionprogram;
interface I1 {
	default void test() {
		System.out.println("Interface I1");
	}
}
interface I2 {
	default void test() {
		System.out.println("Interface I2");
	}
}
class C1 implements I1, I2 {
	public void test() {
		I1.super.test();//explicitly specify which default method
		System.out.println("class C1"); // override the default method
	}
}
public class P5 {
	public static void main(String[] args) {
		I1 ref1 = new C1();
		ref1.test();
		I2 ref2 = new C1();
		ref2.test();
	}
}
