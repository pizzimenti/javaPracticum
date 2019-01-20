class PezDispenser {
	public static final int MAX_PEZ = 12;
	final private String characterName;
	private int pezCount;

	public PezDispenser(String characterName) {
		this.characterName = characterName;
	}

	public boolean isEmpty() {
		if (pezCount == 0) {
			return true;
		} else
			return false;
	}

	public void fill() {
		pezCount = MAX_PEZ;
	}

	public void fill(int pezAmount) {
		int newAmount = pezCount += pezAmount;
		if (newAmount > MAX_PEZ) {
			throw new IllegalArgumentException("Too many Pez");
		}
	}

	public boolean dispense() {
		boolean wasDispensed = false;
		if (!isEmpty()) {
			pezCount--;
			wasDispensed = true;
		}
		return wasDispensed;
	}

	public String getCharacterName() {
		return characterName;
	}

}
