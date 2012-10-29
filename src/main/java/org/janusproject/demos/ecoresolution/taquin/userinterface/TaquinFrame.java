package org.janusproject.demos.ecoresolution.taquin.userinterface;

import javax.swing.JFrame;

import org.janusproject.kernel.Kernel;

public class TaquinFrame extends JFrame{

	public TaquinFrame (Kernel k, int gridSize){
		
		this.setTitle("Taquin - IA54");
	    this.setSize(1024, 768);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
