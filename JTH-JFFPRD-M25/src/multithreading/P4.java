// java.io
// 1. FileOutputStream
// 2. PrintWriter ---> write(char ch)

package multithreading;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class P4 {
	String s = "mango";
	String path = "C:\\Users\\asus\\Desktop\\output.txt";
	 public void writeIntoFile() throws FileNotFoundException, InterruptedException
	{
		FileOutputStream fos = new FileOutputStream(path);
		PrintWriter pw = new PrintWriter(fos);
		for(int i = 0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			pw.write(ch);
			Thread.sleep(2500);
			System.out.println("Printing....");
		}
		pw.flush();
	}
	public void modifyData(String s) {
		this.s = s;
	}
}






