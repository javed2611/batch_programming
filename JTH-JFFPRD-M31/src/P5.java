import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// WAP to display list of employees based on their salary in \
// ascending order

class Employee implements Comparable<Employee> {
	int eid;
	String name;
	double sal;

	public Employee(int eid, String name, double sal) {
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}

	public int compareTo(Employee o) {
		if (this.sal > o.sal) {
			return 10;
		} else if (this.sal < o.sal) {
			return -25;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return eid + " " + name + " " + sal;
	}

}

public class P5 {
	public static void main(String[] args) {
		List<Employee> a = new ArrayList<Employee>();
		a.add(new Employee(1, "Nagesh sir", 500000));
		a.add(new Employee(2, "Bikash Sir", 450000));
		a.add(new Employee(3, "Ravi Sir", 200000));
		a.add(new Employee(4, "Javed", 300000));
		a.add(new Employee(5, "Jai Shankar Sir", 350000));

		Collections.sort(a);

		for (Employee e : a) {
			System.out.println(e);
		}
	}
}
