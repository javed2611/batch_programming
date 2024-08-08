package multithreading;
class A1 {
	synchronized public void demo1(B1 ref) {
		System.out.println("Demo 1 method");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ref.test1();
	}
	synchronized public void test2() {
		System.out.println("Test 2 method");
		notify();
	}
}
class B1 {
	synchronized public void demo2(A1 ref) {
		System.out.println("Demo 2 method");
		ref.test2();
	}
	synchronized public void test1() {
		System.out.println("Test 1 method");
	}
}
public class Driver1 extends Thread {
	A1 a = new A1();
	B1 b = new B1();
	@Override
	public void run() {
		a.demo1(b);
	}
	public void m1() {
		b.demo2(a);
	}
	public static void main(String[] args) {
		Driver1 d = new Driver1();
		d.start();
		d.m1();
	}
}