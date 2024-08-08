package multithreading;
public class P1 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName() + " " + i);
		}
	}
	public static void main(String[] args) {
		P1 ref1 = new P1();
		P1 ref2 = new P1();
		ref1.setName("akash");
		ref2.setName("harsh");
		ref1.start();
		ref2.start();
	}
}
