package multithreading;

public class P3 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		P3 ref = new P3();
		Thread t1 = new Thread(ref);
		Thread t2 = new Thread(ref);
		t1.start();
		t2.start();
	}
}
