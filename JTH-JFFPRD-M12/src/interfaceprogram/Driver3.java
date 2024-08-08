package interfaceprogram;

public class Driver3 implements Cloneable 
{
	int i = 5;
	public static void main(String[] args) {
		Driver3 d1 = new Driver3();
		System.out.println(d1.i);
		d1.i = 15;
		System.out.println(d1.i);

		try {
			Object o = d1.clone();
			System.out.println(o);
		} catch (CloneNotSupportedException e) {
			System.out.println("Handled");
		}
	}
}
