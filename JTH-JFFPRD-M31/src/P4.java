import java.util.ArrayList;
import java.util.List;
class Student {
	int rollno;
	String name;
	int marks;
	public Student(int rollno, String name, int marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return rollno + " " + name + " " + marks;
	}
}
public class P4 {
	public static void main(String[] args) {
		List<Student> a = new ArrayList<Student>();
		a.add(new Student(1, "rohan", 62));
		a.add(new Student(2, "anmol", 71));
		a.add(new Student(3, "komal", 41));
		for (Student s : a) {
			System.out.println(s);
		}
	}
}