// How to make our own class as immutable.
package stringprogramming;
final class Employee {
	private final int id;
	private final String name;
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return getId() + " " + name;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}

public class P28 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "abc");
		System.out.println(e1);
	}
}
