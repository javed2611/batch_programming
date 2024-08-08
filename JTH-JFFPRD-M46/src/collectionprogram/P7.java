package collectionprogram;
@FunctionalInterface
interface Calculator {
	void calculate(int a, int b);
}
class Addition implements Calculator {
	@Override
	public void calculate(int a, int b) {
		System.out.println(a + b);
	}
}
public class P7 {
	public static void main(String[] args) {
		Calculator add = new Addition();
		add.calculate(5, 2);
		Calculator sub = (int a, int b) -> {
			System.out.println(a - b);
		};
		sub.calculate(5, 1);
		Calculator mul = (a, b) -> {
			System.out.println(a * b);
		};
		mul.calculate(4, 5);
	}
}
