package interfaceprogram;
interface Interface1 {
	default void baby() {
		System.out.println("Hii Baby");
	}

	public static void test() {
		System.out.println("Static Method");
	}
}
interface Interface2 {
	default void baby() {
		System.out.println("Bye Baby");
	}
}
class Class1 implements Interface1, Interface2 {
	@Override
	public void baby() {
		System.out.println("Class1");
	}
}
public class Driver1 {
	public static void main(String[] args) {
		Interface1 ref1 = new Class1();
		ref1.baby();
		Interface1.test();
		Interface2 ref2 = new Class1();
		ref2.baby();
	}
}
