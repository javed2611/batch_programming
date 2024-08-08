package wrapper;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
	int rollno;
	String name;
	double marks;
	int age;

	public Student(int rollno, String name, double marks, int age) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.marks > o.marks) {
			return 1;
		} else if (this.marks < o.marks) {
			return -1;
		} else {
			if (this.age > o.age) {
				return -1;
			} else if (this.age < o.age) {
				return 1;
			} else {
				return 0;
			}
		}
	}
}

public class P3 {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(1, "ram", 80, 23));
		students.add(new Student(2, "tanishq", 89, 24));
		students.add(new Student(3, "aaman", 85, 21));
		students.add(new Student(4, "shobit", 85, 22));
		students.add(new Student(5, "siddhesh", 83, 20));
		Collections.sort(students);
		for (Student s : students) {
			System.out.println(s);
		}
	}
}