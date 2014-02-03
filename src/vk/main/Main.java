package vk.main;

import vk.simulation.*;

/**
 * This class starts the whole simulation
 * @author Mark
 *
 */
public class Main {
	
	static Simulator sim;
	/**
	 * Main method that starts the simulator
	 * @param args
	 */
	public static void main(String[] args) {
		Simulator sim = new Simulator();
		System.out.println(sim);
	}
	
	public static Simulator returnSim() {
		return sim;
	}
}