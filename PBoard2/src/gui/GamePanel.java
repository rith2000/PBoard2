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
	private Piano piano;
	
	
	
	 public GamePanel () {
		 super();
		 C4 = new Key("C", new Sound(""), false);
		 CSharp = new Key("C#", new Sound(""), true);
		 piano = new Piano();
		  setBackground(Color.WHITE);
		 
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
	    
	    
//	    int w = 20;
//	    int h = 300;
//	    C4.draw(g, w, h);
//	    CSharp.draw(g, w+15, h);
	    
	    piano.draw(g);
	    
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
			piano.getOctaveKey(0).keyPressed();
		} 
		if (e.getKeyCode() == KeyEvent.VK_D) {
			piano.getOctaveKey(1).keyPressed();
		} 
		if (e.getKeyCode() == KeyEvent.VK_F) {
			piano.getOctaveKey(2).keyPressed();
		} 
		if (e.getKeyCode() == KeyEvent.VK_G) {
			piano.getOctaveKey(3).keyPressed();
		} 
		if (e.getKeyCode() == KeyEvent.VK_H) {
			piano.getOctaveKey(4).keyPressed();
		} 
		if (e.getKeyCode() == KeyEvent.VK_J) {
			piano.getOctaveKey(5).keyPressed();
		} 
		if (e.getKeyCode() == KeyEvent.VK_K) {
			piano.getOctaveKey(6).keyPressed();
		} 
		if (e.getKeyCode() == KeyEvent.VK_L) {
			piano.getOctaveKey(7).keyPressed();
		} 
		
		
		if (e.getKeyCode() == KeyEvent.VK_E) {
			piano.getSharpsKey(0).keyPressed();
		} 
		if (e.getKeyCode() == KeyEvent.VK_R) {
			piano.getSharpsKey(1).keyPressed();
		}
		if (e.getKeyCode() == KeyEvent.VK_Y) {
			piano.getSharpsKey(2).keyPressed();
		}
		if (e.getKeyCode() == KeyEvent.VK_U) {
			piano.getSharpsKey(3).keyPressed();
		}
		if (e.getKeyCode() == KeyEvent.VK_I) {
			piano.getSharpsKey(4).keyPressed();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_S) {
			piano.getOctaveKey(0).keyReleased();	
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			piano.getOctaveKey(1).keyReleased();
		} 
		if (e.getKeyCode() == KeyEvent.VK_F) {
			piano.getOctaveKey(2).keyReleased();
		} 
		if (e.getKeyCode() == KeyEvent.VK_G) {
			piano.getOctaveKey(3).keyReleased();
		} 
		if (e.getKeyCode() == KeyEvent.VK_H) {
			piano.getOctaveKey(4).keyReleased();
		} 
		if (e.getKeyCode() == KeyEvent.VK_J) {
			piano.getOctaveKey(5).keyReleased();
		} 
		if (e.getKeyCode() == KeyEvent.VK_K) {
			piano.getOctaveKey(6).keyReleased();
		} 
		if (e.getKeyCode() == KeyEvent.VK_L) {
			piano.getOctaveKey(7).keyReleased();
		} 
		
		
		if (e.getKeyCode() == KeyEvent.VK_E) {
			piano.getSharpsKey(0).keyReleased();
		}
		if (e.getKeyCode() == KeyEvent.VK_R) {
			piano.getSharpsKey(1).keyReleased();
		}
		if (e.getKeyCode() == KeyEvent.VK_Y) {
			piano.getSharpsKey(2).keyReleased();
		}
		if (e.getKeyCode() == KeyEvent.VK_U) {
			piano.getSharpsKey(3).keyReleased();
		}
		if (e.getKeyCode() == KeyEvent.VK_I) {
			piano.getSharpsKey(4).keyReleased();
		}
		
		
	}
	
}
