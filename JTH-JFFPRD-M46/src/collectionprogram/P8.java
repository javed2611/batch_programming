package collectionprogram;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;
class Employee implements Comparable<Employee> {
	int eid;
	String ename;
	double esalary;
	public Employee(int eid, String ename, double esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	@Override
	public int compareTo(Employee o) {
		if (this.esalary > o.esalary) {
			return -1;
		} else if (this.esalary < o.esalary) {
			return 1;
		} else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return eid + " " + ename + " " + esalary;
	}
}
public class P8 {
	public static void main(String[] args) {
		PriorityQueue<Employee> a = new PriorityQueue<>();
		a.offer(new Employee(1, "bikash sir", 500000));
		a.offer(new Employee(2, "nagesh sir", 8000000));
		a.offer(new Employee(3, "javed", 10000));
		a.offer(new Employee(4, "ravi sir", 300000));
		while (!a.isEmpty()) {
			System.out.println(a.poll());
		}
	}
}



