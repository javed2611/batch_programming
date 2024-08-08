package multithreading;

class A extends Thread
{
	P4 ref;
	A(P4 ref)
	{
		this.ref=ref;
	}
	@Override
	public void run() {
		try {
			ref.writeInFile();
		} catch (Exception e) {
			System.out.println("Handled");
		}
	}
}
class B extends Thread
{
	P4 ref;
	B(P4 ref)
	{
		this.ref = ref;
	}
	@Override
	public void run() {
		ref.modifyData("niteen");
	}
}



public class Driver {
	public static void main(String[] args) throws InterruptedException {
		P4 ref = new P4();
		A t1 = new A(ref);
		B t2 = new B(ref);
		
		
		t1.start();
		Thread.sleep(3000);
		t2.start();
	}
}










