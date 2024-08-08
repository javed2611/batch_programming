
public class P1 {
	public static void main(String[] args) {
		demo(1);
	}

	public static void demo(int i) {
		if (i <= 5) // -----> Base Condition
		{
			System.out.println(i);
			i++;
			demo(i);
		}
		
	}
}
