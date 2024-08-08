package stringprogram;
final class Student {
	final private int rollno;
	final private String name;
	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return rollno + " " + name;
	}
}
public class P24 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "abc");
		System.out.println(s1);
	}
}