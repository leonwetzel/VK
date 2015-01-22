
public class Main {
	
	private Simulator simulator;
	
	/**
	 * Main methode wordt als eerste geroepen en roept simulator aan.
	 * @param args
	 */
	public static void main(String[] args) {
		Main main = new Main();
		main.setSimulator(new Simulator());
	}
	
	/**
	 * set the simulator (brain)
	 * @param simulator 
	 */
	private void setSimulator(Simulator simulator){
		this.simulator = simulator;
	}
	
	/**
	 * get the simulator (brain)
	 * @return Simulator 
	 */
	private Simulator getSimulator(){
		return simulator;
	}

}
