package gui;


import java.awt.*; 
import javax.swing.*;

 

public class Main {
	//diff

	public static void main(String[] args) 
	{ 
//		JFrame window = new JFrame("pBOARD"); // sets bounds of window frame that panel appears in
//		window.setBounds(100, 100, 640, 480);
//		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		GamePanel panel = new GamePanel(); // gamepanel
//		//panel.setBackground(Color.WHITE);
//		Container c = window.getContentPane();
//		c.add(panel);
//		c.addKeyListener(panel);
//		window.setVisible(true); // makes window visible at all time	
//		
//		
//		panel.run();
		
		  JFrame w = new JFrame("pBoard");
		    w.setBounds(100, 100, 1280, 960);
		    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    GamePanel panel = new GamePanel();
		    w.addKeyListener(panel);
		    w.add(panel);
		    w.setResizable(true);
		    w.setVisible(true);
		    
		    panel.run();
	}
}
