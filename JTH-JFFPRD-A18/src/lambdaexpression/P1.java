package lambdaexpression;
@FunctionalInterface
interface I {
	void demo();
}
@FunctionalInterface
interface I1 {
	void sum(int a, int b);
}
public class P1 { // Driver Class
	public static void main(String[] args) {
		I ref1 = () -> {
			System.out.println("Lambda Expression");
		};

		ref1.demo();
		I1 ref2 = (x, y) -> {
			System.out.println("The result is ");
			System.out.println(x + y);
		};
		ref2.sum(5, 1);
	}
}
