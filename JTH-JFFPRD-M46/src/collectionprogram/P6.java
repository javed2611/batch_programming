package collectionprogram;

class A2 {
	int x = 1;
}

class B2 extends A2 {
	int x = 2;

	public void test() {
		int x = 3;
		System.out.println("Directly " + x);
		System.out.println("this " + this.x);
		System.out.println("super " + super.x);
	}
}

public class P6 {
	public static void main(String[] args) {
		B2 b = new B2();
		b.test();
	}
}
