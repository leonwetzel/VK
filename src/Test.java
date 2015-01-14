/**
 * Dit is een testklasse die is ontworpen door Leon Wetzel
 * @author Leon
 *
 */
public class Test {
	// velden
	private int favoNumber = 11;
	private char favoChar = 'w';
	
	/**
	 * Constructor for class Test
	 */
	public Test() {
		System.out.println("Dit is een test-constructor, die onderdeel is van de testklasse.");
	}
	
	/**
	 * Method to cumulate 2 ints of choice
	 * @param first
	 * @param second
	 * @return
	 */
	public int cumulateInts(int first, int second) {
		return first+second;
	}
	
	/**
	 * Method to get the favorite number
	 * @return favorite number
	 */
	public int getFavoNumber() {
		return favoNumber;
	}

	/**
	 * Method to set the favorite number
	 * @param favoNumber
	 */
	public void setFavoNumber(int favoNumber) {
		this.favoNumber = favoNumber;
	}
	
	/**
	 * Method to get the favorite character
	 * @return favorite character
	 */
	public char getFavoChar() {
		return favoChar;
	}

	/**
	 * Method to set the favorite character
	 * @param favoChar
	 */
	public void setFavoChar(char favoChar) {
		this.favoChar = favoChar;
	}

}
