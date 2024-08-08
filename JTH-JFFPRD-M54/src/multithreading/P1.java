package multithreading;

public class P1 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 7; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		P1 ref1 = new P1();
		ref1.start();
		P1 ref2 = new P1();
		ref2.start();
		P1 ref3 = new P1();
		ref3.start();
	}
}