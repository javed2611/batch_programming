package multithreading;

public class P2 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		P2 ref1 = new P2(); // created a Thread 
		P2 ref2 = new P2(); // created a Thread
		
		ref1.start();
		ref2.start();
	}
}
