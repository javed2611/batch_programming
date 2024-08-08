package collectionProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
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

	public String toString() {
		return rollno + " " + name + " " + marks + " " + age;
	}
}

public class P2 {
	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<>();
		a.add(new Student(1, "shivam", 45, 22));
		a.add(new Student(2, "soham", 65, 20));
		a.add(new Student(3, "pratiksha", 65, 23));
		a.add(new Student(4, "sai", 35, 16));
		Comparator<Student> c1 = (Student s1, Student s2) -> {
			if (s1.marks> s2.marks) {
				return 1;
			}
			else if (s1.marks<s2.marks) {
				return -1;
			}
			else
			{
				return 0;
			}
		};
		Collections.sort(a,c1);
		for (Student s : a) {
			System.out.println(s);
		}
	}
}