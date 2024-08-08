interface Animal {
	void sound();
	default void food() {
		System.out.println("i am having food");
	}
	public static void demo() {
		System.out.println("HI animal");
	}
}
class Cat implements Animal {
	public void sound() {
		System.out.println("Meow Meow");
	}
}
class Dog implements Animal {
	public void sound() {
		System.out.println("Bow Bow");
	}
}
public class P7 {
	public static void main(String[] args) {
		Animal.demo();
		Animal cat = new Cat();
		cat.sound();
		cat.food();
		Animal dog = new Dog();
		dog.sound();
		dog.food();
	}
}
