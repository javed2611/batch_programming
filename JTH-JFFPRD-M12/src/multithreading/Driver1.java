package multithreading;

class C1 {
	synchronized public void demo1(C2 ref) {
		System.out.println("Demo 1 method");
		try {
			wait(); // InterThread Communication
		} catch (InterruptedException e) {
			System.out.println("Handled");
		}
		ref.test1();
	}
	synchronized public void test2() {
		System.out.println("Test 2");
		notify();
	}
}
class C2 {
	synchronized public void demo2(C1 ref) {
		System.out.println("Demo2 method");
		ref.test2();
	}
	synchronized public void test1() {
		System.out.println("Test 1");
	}
}
public class Driver1 extends Thread {
	C1 ref1 = new C1();
	C2 ref2 = new C2();
	@Override
	public void run() {
		ref1.demo1(ref2);
	}
	public static void main(String[] args) {
		Driver1 d = new Driver1();
		d.start();
		d.ref2.demo2(d.ref1);
	}
}
