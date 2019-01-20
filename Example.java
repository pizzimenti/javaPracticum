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
	}
}
