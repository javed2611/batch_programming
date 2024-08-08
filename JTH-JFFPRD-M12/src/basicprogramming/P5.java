package basicprogramming;

import java.util.Scanner;

public class P5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dist = sc.nextInt();
		int time = sc.nextInt();
		if (dist <= 0 || time <= 0) {
			System.out.println("Invalid Input");
		} else if (dist <= 250 && time <= 8) {
			System.out.println(2000);
		} else if (dist > 250 && time <= 8) {
			System.out.println(2000 + (dist - 250) * 20);
		} else if (time > 8 && dist <= 250) {
			System.out.println(2000 + (time - 8) * 100);
		} else if (time > 8 && dist > 250) {
			System.out.println(2000 + (dist - 250) * 20);
		}
	}
}
