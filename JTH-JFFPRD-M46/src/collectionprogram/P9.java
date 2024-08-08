package collectionprogram;

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

	@Override
	public String toString() {
		return rollno + " " + name + " " + marks + " " + age;
	}
}

class AgeComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		if (o1.age > o2.age) {
			return 1;
		} else if (o1.age < o2.age) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class P9 {
	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<>();
		a.add(new Student(1, "sagar", 86, 24));
		a.add(new Student(2, "pratik", 80, 22));
		a.add(new Student(3, "tejal", 75, 23));
		a.add(new Student(4, "amruta", 77, 25));
		Comparator<Student> ref = (o1, o2) -> {
			return (int) (o1.marks - o2.marks);
		};
		Collections.sort(a, ref);
		for (Student s : a) {
			System.out.println(s);
		}
		System.out.println("--------------------------------");
		AgeComparator ref1 = new AgeComparator();
		Collections.sort(a, ref1);
		for (Student s : a) {
			System.out.println(s);
		}
	}
}
