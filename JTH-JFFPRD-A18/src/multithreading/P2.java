package multithreading;

public class P2 extends Thread
{
	@Override
	public void run(){
		for(int i = 1 ;i <= 5 ;i++)
		{
			System.out.println(i + " " + getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Bye BYe");
			}
		}
	}
	public static void main(String[] args) {
		P2 ref1 = new P2(); // Thread-0
		P2 ref2 = new P2(); // Thread-1
		
		ref1.setName("apple");
		ref2.setName("grape");
		
		ref1.start();
		ref2.start();
	}
}







