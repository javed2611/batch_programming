package collectionprogram;
interface Animal {
	void sound();
	default public void food() {
		System.out.println("I am eating food");
	}
}
class Dog implements Animal {
	public void sound() {
		System.out.println("Bark");
	}
}
class Cat implements Animal {
	public void sound() {
		System.out.println("Meow");
	}
}
public class P4 {
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.sound();
		dog.food();
		Animal cat = new Cat();
		cat.sound();
		cat.food();
	}
}
