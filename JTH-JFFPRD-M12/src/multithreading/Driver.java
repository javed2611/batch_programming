package multithreading;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
class P3 {
	String s = "last day";
	String path = "C:\\Users\\asus\\Desktop\\output.txt";
	synchronized public void writeIntoFile() throws FileNotFoundException, InterruptedException {
		FileOutputStream fos = new FileOutputStream(path);
		PrintWriter pw = new PrintWriter(fos);
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			pw.write(ch);
			System.out.println("Printing Character");
			Thread.sleep(1500);
		}
		pw.flush();
	}
	synchronized public void modifyString(String s) {
		this.s = s;
	}
}
class A extends Thread {
	P3 ref;
	A(P3 ref) {
		this.ref = ref;
	}
	@Override
	public void run() {
		try {
			ref.writeIntoFile();
		} catch (Exception e) {
			System.out.println("Handled");
		}
	}
}
class B extends Thread {
	P3 ref;
	B(P3 ref) {
		this.ref = ref;
	}
	@Override
	public void run() {
		ref.modifyString("mock monday");
	}
}
public class Driver {
	public static void main(String[] args) throws InterruptedException {
		P3 ref = new P3();
		A t1 = new A(ref);
		B t2 = new B(ref);
		t1.start();
		Thread.sleep(3000);
		t2.start();
	}
}
