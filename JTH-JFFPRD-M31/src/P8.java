interface Interface1 {
	default void demo() {
		System.out.println("Method of Interface1");
	}
}
interface Interface2 {
	default void demo() {
		System.out.println("Method of Interface2");
	}
}
class Class1 implements Interface1, Interface2 {
	@Override
	public void demo() {
		Interface1.super.demo();
		Interface2.super.demo();
	}
}
public class P8 {
	public static void main(String[] args) {
		Interface1 i1 = new Class1();
		i1.demo();
		Interface2 i2 = new Class1();
		i2.demo();
	}
}