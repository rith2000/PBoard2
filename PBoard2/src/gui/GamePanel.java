package gui;


import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;

import javax.swing.JFrame;
import javax.swing.JPanel;

import piano.Key;
import piano.Piano;
import piano.Sound;

public class GamePanel extends JPanel implements KeyListener{

	public static final int DRAWING_WIDTH = 800;
	public static final int DRAWING_HEIGHT = 600;
	
	private Key C4, CSharp;
	private boolean isS, isE;
	
	
	 public GamePanel () {
		 super();
		 C4 = new Key("C", new Sound(""), false);
		 CSharp = new Key("C#", new Sound(""), true);
		  setBackground(Color.WHITE);
		  isS = false;
		  isE = false;
	  }
	 
	 public void paintComponent(Graphics g)
	  {
	    super.paintComponent(g);  // Call JPanel's paintComponent method to paint the background

	    int width = getWidth();
	    int height = getHeight();
	    
	    double ratioX = (double)width/DRAWING_WIDTH;
	    double ratioY = (double)height/DRAWING_HEIGHT;
	    
	    Graphics2D g2 = (Graphics2D)g;
	    AffineTransform at = g2.getTransform();
	    g2.scale(ratioX,ratioY);
	    
	    //System.out.println("hi");
	    if(isS)
	    		C4.keyPressed();
	    else 
	    		C4.keyReleased();
	    
	    if(isE)
    			CSharp.keyPressed();
	    else 
	    		CSharp.keyReleased();

	    int w = 20;
	    int h = 300;
	    C4.draw(g, w, h);
	    CSharp.draw(g, w+15, h);
	    
	    g2.setTransform(at);
	  }
	 
	 public void run() {
		  	while(true) {

		  		// SHOW THE CHANGE
		  		
		  		repaint();
		  		
		  		//paintComponent()
		  		
		  		
		  		// WAIT
		  		try {
					Thread.sleep(16);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		  		
		  	}
		  }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//not checking that key's pressed
		if (e.getKeyCode() == KeyEvent.VK_S) {
			//System.out.println("keyPressed");
			isS = true;
		} 
		if (e.getKeyCode() == KeyEvent.VK_E) {
			//System.out.println("keyPressed");
			isE = true;
		} 
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_S) {
				
			isS = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_E) {
			//System.out.println("keyPressed");
			isE = false;
		} 
		
	}
	
}
