@FunctionalInterface // Single Abstract Method Interface
interface Vehicle {
	void features(String name);
}
@FunctionalInterface
interface Calculator
{
	void calculate(int a, int b);
}
public class P9 {
	public static void main(String[] args) {
		Vehicle car = (String name) -> 
		{System.out.println("I am driving car " + name);};
		car.features("Honda");
		Vehicle bike = (s) -> {System.out.println("i am riding " + s);};
		bike.features("Hero");
		Calculator sum = (int x,int y) -> {System.out.println(x+y);};
		sum.calculate(10, 5);
		Calculator multiply = (e,f) -> {System.out.println(e*f);};
		multiply.calculate(3,2);
	}
}





