package wrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Employee {
	int id;
	String name;
	int exp;
	double sal;

	public Employee(int id, String name, int exp, double sal) {
		this.id = id;
		this.name = name;
		this.exp = exp;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", exp=" + exp 
				+ ", sal=" + sal + "]";
	}
}

class ABC implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.sal > o2.sal) {
			return 1;
		} else if (o1.sal < o2.sal) {
			return -1;
		} else {
			return 0;
		}
	}
}
class DEF implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.exp > o2.exp) {
			return 1;
		} else if (o1.exp < o2.exp) {
			return -1;
		} else {
			return 0;
		}
	}
}
public class P4 {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "bikash sir", 4, 700000));
		employees.add(new Employee(2, "ravi sir", 3, 100000));
		employees.add(new Employee(3, "Sachin mama", 1, 20000));
		employees.add(new Employee(4, "jayashankar sir", 2, 200000));
		employees.add(new Employee(5, "javed", 3, 50000));
		ABC ref = new ABC();
		Collections.sort(employees, ref);
		for (Employee e : employees) {
			System.out.println(e);
		}

		System.out.println("------------------------------------------------");
		DEF ref1 = new DEF();
		Collections.sort(employees, ref1);
		for (Employee e : employees) {
			System.out.println(e);
		}
	}
}
