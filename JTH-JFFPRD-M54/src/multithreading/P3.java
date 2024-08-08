package multithreading;
import java.io.FileOutputStream;
import java.io.PrintWriter;
class A1 {
	String data = "orange";
	String path = "C:\\Users\\asus\\Desktop\\output.txt";
	public void printIntoFile() throws Exception {
		FileOutputStream fos = new FileOutputStream(path);
		PrintWriter pw = new PrintWriter(fos);
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			pw.write(ch);
			Thread.sleep(1500);
			System.out.println("Printing...");
		}
		pw.flush();
	}
	public void modifyData(String data) {
		this.data = data;
	}
}
class B1 extends Thread // T1
{
	A1 ref;
	B1(A1 ref) {
		this.ref = ref;
	}
	@Override
	public void run() {
		try {
			ref.printIntoFile();
		} catch (Exception e) {
			System.out.println("handled");
		}
	}
}
class C1 extends Thread // T2
{
	A1 ref;
	C1(A1 ref) {
		this.ref = ref;
	}
	@Override
	public void run() {
		ref.modifyData("kiwi");
	}
}
public class P3 {
	public static void main(String[] args) throws InterruptedException {
		A1 ref = new A1();
		B1 t1 = new B1(ref);
		C1 t2 = new C1(ref);
		t1.start();
		Thread.sleep(3000);
		t2.start();
	}
}
