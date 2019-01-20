public class Example {

	public static void main(String[] args) {
		System.out.println("We are making a new item.");
		PezDispenser dispenser = new PezDispenser("Donatello");
		System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());
		if (dispenser.isEmpty()) {
			System.out.println("Dispenser is empty");
		}
		System.out.println("Filling the dispenser with delicious PEZ...");
		dispenser.fill();
		if (!dispenser.isEmpty()) {
			System.out.println("Dispenser is now full");
		}
		while (dispenser.dispense()) {
			System.out.println("Chomp!");
		}
		if (dispenser.isEmpty()) {
			System.out.println("All the pez are gone");
		}
		dispenser.fill(4);
		dispenser.fill(2);
		while (dispenser.dispense()) {
			System.out.println("Chomp.");
		}
		try {
			dispenser.fill(400);
			System.out.println(("this won't happen"));
		} catch (IllegalArgumentException iae) {
			System.out.println("Whoa there, you can't load more");
		}
	}
}
