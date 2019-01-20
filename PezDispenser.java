class PezDispenser {
	public static final int MAX_PEZ = 12;
	final private String characterName;
	private int pezCount;

	public PezDispenser(String characterName) {
		this.characterName = characterName;
	}

	public boolean isEmpty (){
		if(pezCount == 0){
			return true;
		} else return false;
	}

	public void fill() {
		pezCount = MAX_PEZ;
	}

	public void fill(int pezAmount) {
		pezCount += pezAmount;
	}

	public String getCharacterName() {
		return characterName;
	}

}
