package multithreading;
class A extends Thread {
	P4 ref;
	A(P4 ref) {
		this.ref = ref;
	}
	@Override
	public void run() {
		try {
			ref.writeIntoFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class B extends Thread {
	P4 ref;
	B(P4 ref) {
		this.ref = ref;
	}
	@Override
	public void run() {
		ref.modifyData("kiwi");
	}
}
public class Driver {
	public static void main(String[] args) {
		P4 ref = new P4();
		A t1 = new A(ref);
		B t2 = new B(ref);

		t1.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}
}
