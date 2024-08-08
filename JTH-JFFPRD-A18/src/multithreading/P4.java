package multithreading;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

//FileOutputStream
// PrintWriter --> write(char ch)

public class P4 {
	String s = "ankit";
	String path = "C:\\Users\\asus\\Desktop\\result.txt";

	synchronized public void writeInFile() throws FileNotFoundException, InterruptedException {
		FileOutputStream fos = new FileOutputStream(path);
		PrintWriter pw = new PrintWriter(fos);
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			pw.write(ch);
			Thread.sleep(2000);
			System.out.println("Printing.....");
		}
		pw.flush();
	}

	synchronized public void modifyData(String s) {
		this.s = s;
	}
}



