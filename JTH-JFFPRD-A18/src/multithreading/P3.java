package multithreading;
class Animal {
}
public class P3 extends Animal implements Runnable {
	@Override
	public void run() {
		for (char i = 'A'; i <= 'I'; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		P3 ref = new P3();
		Thread ref1 = new Thread(ref);
		Thread ref2 = new Thread(ref);
		ref1.start();
		ref2.start();
	}
}
