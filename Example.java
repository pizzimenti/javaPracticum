public class Example {

	public static void main (String[] args) {
		System.out.println("We are making a new item.");
		PezDispenser dispenser = new PezDispenser();
		System.out.printf("The dispenser is %s %n",
				  dispenser.getCharacterName());
	}
}


