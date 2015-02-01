import java.awt.Color;

/**
 * Klasse CirkelDeel voor Vossen & Konijnen
 * 
 * @author leonwetzel
 *
 */
public class CirkelDeel {

	private double value;
	private Color color;

	/**
	 * Constructor
	 * 
	 * @param value
	 * @param color
	 */
	public CirkelDeel(double value, Color color) {
		this.value = value;
		this.color = color;
	}

	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * @param value
	 */
	public void setValue(double value) {
		this.value = value;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color
	 */
	public void setColor(Color color) {
		this.color = color;
	}

}
