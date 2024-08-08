package arraysprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> a = new ArrayList<>();
		while (true) {
			System.out.println("Enter the value");
			int n = sc.nextInt();
			a.add(n);
			if (n == -1) {
				break;
			}
		}
		System.out.println("Your output is");
		System.out.println(a);
	}
}
