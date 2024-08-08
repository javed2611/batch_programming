package stringprograms;
final class Student {
	final private int rollno;
	final private String name;
	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return rollno + " " + name;
	}
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
}
public class Driver {
	public static void main(String[] args) {
		Student s1 = new Student(1, "ABC");
		System.out.println(s1);
	}
}




