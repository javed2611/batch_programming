package pack1;

public class B {
	public static void main(String[] args) {
		A ref = A.getA();
		System.out.println(ref);
		A ref1 = A.getA();
		System.out.println(ref1);
	}
}
