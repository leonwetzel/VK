import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * Class for displaying simulation data in a pie chart
 * 
 * Special thanks go out to nraj of Stack Overflow
 * http://stackoverflow.com/questions/13662984/creating-pie-charts-programmatically
 * 
 * @author leonwetzel
 *
 */
public class CirkelDiagram extends JComponent {

	// hoeveelheid actors
	private static final int HOEVEELHEID_ACTORS = 4;
	// 'pizzastukken' van het cirkeldiagram
	private CirkelDeel[] delen = { new CirkelDeel(5, Color.black),
			new CirkelDeel(33, Color.green), new CirkelDeel(20, Color.yellow),
			new CirkelDeel(15, Color.red) };

	/**
	 * Constructor
	 */
	CirkelDiagram() {
		CirkelDeel[] delen = new CirkelDeel[HOEVEELHEID_ACTORS];
	}

	/**
	 * Methode om een cirkeldiagram te maken met behulp van het veld 'delen'
	 * @param g
	 */
	public void paint(Graphics g) {
		drawPie((Graphics2D) g, getBounds(), delen);
	}

	/**
	 * Methode om een cirkeldiagram te tekenen
	 * @param g
	 * @param gebied
	 * @param delen
	 */
	public void drawPie(Graphics2D g, Rectangle gebied, CirkelDeel[] delen) {
		double totaal = 0.0D;
		for (int i = 0; i < delen.length; i++) {
			totaal += delen[i].getValue();
		}
		double curValue = 0.0D;
		int startAngle = 0;
		for (int i = 0; i < delen.length; i++) {
			startAngle = (int) (curValue * 360 / totaal);
			int arcAngle = (int) (delen[i].getValue() * 360 / totaal);
			g.setColor(delen[i].getColor());
			g.fillArc(gebied.x, gebied.y, gebied.width, gebied.height, startAngle,
					arcAngle);
			curValue += delen[i].getValue();
		}
	}
}
