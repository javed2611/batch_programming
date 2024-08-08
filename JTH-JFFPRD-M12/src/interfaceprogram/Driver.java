package interfaceprogram;
interface I1 {
	void demo();

	default void test() {
		System.out.println("Test Method");
	}
}
class A implements I1 {
	@Override
	public void demo() {
		System.out.println("Class A");
	}
}
class B implements I1 {
	@Override
	public void demo() {
		System.out.println("Class B");
	}
}
public class Driver {
	public static void main(String[] args) {
		I1 ref = new A();
		ref.demo();
		ref.test();

		I1 ref1 = new B();
		ref1.demo();
		ref1.test();
	}
}
