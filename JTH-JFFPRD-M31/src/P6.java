import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Fruit {
	String name;
	String season;
	int price;
	public Fruit(String name, String season, int price) {
		this.name = name;
		this.season = season;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + " " + season + " " + price;
	}
}
class PriceComparator implements Comparator<Fruit> {
	public int compare(Fruit o1, Fruit o2) {
		if (o1.price > o2.price) {
			return 1;
		} else if (o1.price < o2.price) {
			return -1;
		} else {
			return 0;
		}
	}
}
class NameComparator implements Comparator<Fruit> {
	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}
}

class SeasonComparator implements Comparator<Fruit> {
	public int compare(Fruit o1, Fruit o2) {
		return o1.season.compareTo(o2.season);
	}
}

public class P6 {
	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<Fruit>();
		fruits.add(new Fruit("mango", "summer", 160));
		fruits.add(new Fruit("apple", "winter", 220));
		fruits.add(new Fruit("papaya", "all time", 160));
		fruits.add(new Fruit("watermelon", "summer", 40));
		fruits.add(new Fruit("banana", "all time", 50));
		fruits.add(new Fruit("orange", "winter", 160));
		Collections.sort(fruits, new PriceComparator());
		for (Fruit f : fruits) {
			System.out.println(f);
		}
		System.out.println("---------------------------------");
		Collections.sort(fruits, new NameComparator());
		for (Fruit f : fruits) {
			System.out.println(f);
		}
		System.out.println("---------------------------------");
		Collections.sort(fruits, new SeasonComparator());
		for (Fruit f : fruits) {
			System.out.println(f);
		}
	}
}
