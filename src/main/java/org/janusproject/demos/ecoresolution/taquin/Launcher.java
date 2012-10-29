package org.janusproject.demos.ecoresolution.taquin;

import org.janusproject.demos.ecoresolution.taquin.userinterface.TaquinFrame;
import org.janusproject.kernel.Kernel;
import org.janusproject.kernel.agent.Kernels;

public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int gridSize = 3;
		final int nb_place = gridSize * gridSize;
		
		Kernel k = Kernels.get();
		TaquinFrame frame = new TaquinFrame(k, gridSize);
		frame.setVisible(true);

	}

}
