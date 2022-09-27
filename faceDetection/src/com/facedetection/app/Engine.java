package com.facedetection.app;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.facedetection.gui.MainFrame;

public class Engine {
	
	public Engine() {
		super();
	}
	
	public void start() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new MainFrame();
			}
		});
	}
}
