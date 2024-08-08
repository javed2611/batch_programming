package collectionProgramming;
import java.util.ArrayList;
class Employee {
	int id;
	String name;
	double sal;
	public Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return id + " " + name + " " + sal;
	}
}
public class P1 {
	public static void main(String[] args) {
		ArrayList<Employee> a = new ArrayList<>();
		a.add(new Employee(1, "javed", 150));
		a.add(new Employee(2, "ravi sir", 300));
		a.add(new Employee(3, "bikash sir", 500));
		a.add(new Employee(4, "jay shankar sir", 100));
		a.add(new Employee(5, "nagesh sir", 200000));

		for (Employee o : a) {
			System.out.println(o);
		}
	}
}
