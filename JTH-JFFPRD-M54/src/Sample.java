

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		for (int j = 1; j <= 3; j++) {
			for (int k = 1; k <= 11 - j + 1; k++) {
				System.out.print(" "); // for printing space
			}
			for (int k = 1; k <= ((j * j) + 2 - j) / 2; k++) {
				System.out.print("*"); // for printing star
				Thread.sleep(100);
			}
			System.out.println();
		}
		for (int j = 1; j <= 3; j++) {
			for (int k = 1; k <= 2 * (4 - j + 1); k++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 + (4 * j); k++) {
				System.out.print("*");
				Thread.sleep(100);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 2; i++) {
			for (int u = 1; u <= 2 - i + 1; u++) {
				System.out.print(" ");
			}
			System.out.print("*");
			Thread.sleep(100);
			for (int u = 1; u <= i * (i * i) - (i * i); u++) {
				System.out.print(" ");
			}
			for (int u = 1; u <= 2 * (2 - i + 1) - 1; u++) {
				System.out.print("*");
				Thread.sleep(100);
			}
			for (int u = 1; u <= 2 * (5 - i + 1); u++) {
				System.out.print(" ");
			}
			System.out.print("*");
			Thread.sleep(100);
			for (int u = 1; u <= i * (i * i) - (i * i); u++) {
				System.out.print(" ");
			}
			for (int u = 1; u <= 2 * (2 - i + 1) - 1; u++) {
				System.out.print("*");
				Thread.sleep(100);
			}
			System.out.println();
		}

		for (int u = 1; u <= 3; u++) {
			for (int v = 1; v <= u; v++) {
				System.out.print(" ");
			}
			System.out.print("*");
			Thread.sleep(100);
			for (int v = 1; v <= (11 - u + 1) / 2; v++) {
				System.out.print(" ");
			}
			System.out.print("*");
			Thread.sleep(100);
			for (int v = 1; v <= 5 - u + 1; v++) {
				System.out.print(" ");
			}
			for (int v = 1; v <= 1 - u + 1; v++) {
				System.out.print(" ");
			}
			System.out.print("*");
			Thread.sleep(100);
			for (int v = 1; v <= 5; v++) {
				System.out.print(" ");
			}
			System.out.print("*");
			Thread.sleep(100);
			System.out.println();
		}

		for (int u = 1; u <= 4; u++) {
			for (int v = 1; v <= 8; v++) {
				System.out.print(" ");
			}
			System.out.print("*");
			Thread.sleep(100);
			for (int v = 1; v <= 3; v++) {
				System.out.print(" ");
			}
			System.out.print("*");
			Thread.sleep(100);
			System.out.println();
		}

		for (int u = 1; u <= 4; u++) {
			for (int v = 1; v <= 8 + u; v++) {
				System.out.print(" ");
			}
			System.out.print("*");
			Thread.sleep(100);
			for (int v = 1; v <= (7 - u + 1) / 2; v++) {
				System.out.print(" ");
			}
			System.out.print("*");
			Thread.sleep(100);
			System.out.println();
		}
		for (int u = 1; u <= 2; u++) {
			for (int v = 1; v <= 12; v++) {
				System.out.print(" ");
			}
			System.out.print("*");
			Thread.sleep(100);
			for (int v = 1; v <= 2 - u + 1; v++) {
				System.out.print(" ");
			}
			System.out.print("*");
			Thread.sleep(100);
			System.out.println();
		}

		for (int u = 1; u <= 5; u++) {
			for (int v = 1; v <= 11 - u + 1; v++) {
				System.out.print(" ");
			}
			System.out.print("*");
			Thread.sleep(100);
			for (int v = 1; v <= 1; v++) {
				System.out.print(" ");
			}
			System.out.print("*");
			Thread.sleep(100);
			System.out.println();
		}

		for (int u = 1; u <= 4; u++) {
			for (int v = 1; v <= 6 + u; v++) {
				System.out.print(" ");
			}
			System.out.print("*");
			Thread.sleep(100);
			for (int v = 1; v <= (3 - u + 1) / 2; v++) {
				System.out.print(" ");
				System.out.print("*");
				Thread.sleep(100);
			}
			System.out.println();
		}

		System.out.println();

		for (int u = 1; u <= 2; u++) {
			for (int v = 1; v <= 4 + (u * 2); v++) {
				System.out.print(" ");
			}
			for (int v = 1; v <= 4 * (2 - u + 1) + 1; v++) {
				System.out.print("*");
				Thread.sleep(100);
			}
			System.out.println();
		}

		for (int u = 1; u <= 1; u++) {
			for (int v = 1; v <= 10; v++) {
				System.out.print(" ");
			}
			System.out.print("*");
			Thread.sleep(100);
		}
	}
}