package multithreading;

class A1 {
	public synchronized void demo1(B1 ref) {
		System.out.println("Demo 1");
		
		ref.test1();
	}

	public synchronized void test2() {
		System.out.println("Test 2");
	}
}

class B1 {
	public synchronized void demo2(A1 ref) {
		System.out.println("Demo 2");
		try {
			wait(); // Inter Thread Communication
		} catch (InterruptedException e) {
			System.out.println("Handled");
		}
		ref.test2();
	}

	public synchronized void test1() {
		System.out.println("Test 1");
		notify(); // Inter Thread Communication
	}
}

public class Driver1 extends Thread {
	A1 t1 = new A1();
	B1 t2 = new B1();

	@Override
	public void run() {
		t1.demo1(t2);
	}

	public static void main(String[] args) {
		Driver1 d = new Driver1();
		d.start();
		d.t2.demo2(d.t1);
	}
}
