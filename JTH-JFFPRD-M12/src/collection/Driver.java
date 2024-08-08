package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	int rollno;
	String name;
	int age;
	int marks;
	public Student(int rollno, String name, int age, int marks) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return rollno + " " + name + " " + age + " " + marks;
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
class MarksComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		if (o1.marks > o2.marks) {
			return 1;
		} else if (o1.marks < o2.marks) {
			return -1;
		} else {
			return 0;
		}
	}
}

class NameComparator implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}

public class Driver {
	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<>();
		a.add(new Student(1, "Dheeraj", 21, 53));
		a.add(new Student(2, "Rishi", 23, 60));
		a.add(new Student(3, "Sumit", 22, 41));
		a.add(new Student(4, "Akash", 20, 65));
		a.add(new Student(5, "Arun", 16, 51));

		Collections.sort(a, new AgeComparator());

		for (Student s : a) {
			System.out.println(s);
		}
		System.out.println("----------------------------");

		Collections.sort(a, new MarksComparator());

		for (Student s : a) {
			System.out.println(s);
		}
		System.out.println("----------------------------");

		Collections.sort(a, new NameComparator());

		for (Student s : a) {
			System.out.println(s);
		}
	}
}
