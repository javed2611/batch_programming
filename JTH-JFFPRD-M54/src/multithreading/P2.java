package multithreading;

class A {
}

public class P2 extends A implements Runnable {
	@Override
	public void run() {
		for (char ch = 'a'; ch <= 'j'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.out.println("Handled");
			}
		}
	}

	public static void main(String[] args) {
		P2 ref = new P2();
		Thread ref1 = new Thread(ref);
		Thread ref2 = new Thread(ref);
		ref1.start();
		ref2.start();
	}
}