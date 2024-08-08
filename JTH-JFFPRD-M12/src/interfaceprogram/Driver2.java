package interfaceprogram;
@FunctionalInterface
interface Animal {
	void sound();
}
interface SumOfNumber
{
	public void sum(int a, int b);
}
public class Driver2 {
	public static void main(String[] args) {
		Animal dog = () -> {System.out.println("Bhow Bhow");};
		dog.sound();
		Animal cat = () -> {System.out.println("Meow Meow");
		};
		cat.sound();
		SumOfNumber s1 = (int a, int b) -> {System.out.println(a+b);};
		s1.sum(10, 5);
		s1.sum(3, 1);
	}
}



