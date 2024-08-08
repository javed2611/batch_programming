package pack1;

public class A // Singleton Class 
{
	private A()
	{
		System.out.println("This is class A constructor");
	}
	static A ref = new A();
	
	public static A getA() {
		return ref;
	}
}
