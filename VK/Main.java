/**
 * 
 * This class is part of the Vossen & Konijnen Project by Jesse Stal, Paul Koning,
 * Michaël van der Veen and Leon Wetzel. Don't steal this work. 
 * 
 * Questions regarding code or development process? Please send an e-mail to l.f.a.wetzel@st.hanze.nl.
 */
public class Main {
	
	private Simulator simulator;
	private PieChartSample pie;
	
	/**
	 * Main methode wordt als eerste geroepen en roept simulator aan.
	 * @param args
	 */
	public static void main(String[] args) {
		Main main = new Main();
		main.setSimulator(new Simulator());
		main.setPie(new PieChartSample());
	}
	
	/**
	 * @return the pie
	 */
	public PieChartSample getPie() {
		return pie;
	}

	/**
	 * @param pie the pie to set
	 */
	public void setPie(PieChartSample pie) {
		this.pie = pie;
	}

	/**
	 * set de simulator
	 * @param simulator 
	 */
	private void setSimulator(Simulator simulator){
		this.simulator = simulator;
	}
	
	/**
	 * getter voor simulator
	 * overbodig?
	 * @return Simulator 
	 */
	private Simulator getSimulator(){
		return simulator;
	}

}
