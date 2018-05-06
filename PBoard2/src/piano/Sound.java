package piano;


import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 * The Sound will 
 * @author amandasun
 * @version 1.0 [5/4/18]
 */
public class Sound {
	private static URL sound;

	public Sound(String url) {
		sound = getClass().getClassLoader().getResource(url);
		
	}

	public static void playSound() throws Exception{
		
	}
	
	
}

