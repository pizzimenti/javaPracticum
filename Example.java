public class Example {

	public static void main(String[] args) {
		System.out.println("We are making a new item.");
		PezDispenser dispenser = new PezDispenser("Donatello");
		System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());
		System.out.println("Filling the dispenser with delicious PEZ...");
		dispenser.fill();
	}
}
