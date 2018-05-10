package piano;

import java.awt.Graphics;

import gui.GamePanel;

public class Piano {

	private Key[] octave;
	private Key[] sharps;
	
	
	public Piano() {
		Sound s = new Sound("");
		Key c4 = new Key("C4","S", s, false);
		Key d = new Key("D","D", s, false);
		Key e = new Key("E","F", s, false);
		Key f = new Key("F","G", s, false);
		Key g = new Key("G", "H",s, false);
		Key a = new Key("A","J", s, false);
		Key b = new Key("B", "K",s, false);
		Key c5 = new Key("C5","L", s, false);
		
		Key cSharp = new Key("C#", "E",s, true);
		Key dSharp = new Key("D#", "R",s, true);
		
		Key fSharp = new Key("F#", "Y",s, true);
		Key gSharp = new Key("G#", "U",s, true);
		Key aSharp = new Key("A#", "I",s, true);
		
		
		Key[] octaveC = {c4,d,e,f,g,a,b,c5};
		octave = octaveC;
		
		Key[] sharpsC = {cSharp,dSharp, fSharp, gSharp, aSharp};
		sharps = sharpsC;
	}
	
	public Key getOctaveKey(int i) {
		return octave[i];
	}
	
	public Key getSharpsKey(int i) {
		return sharps[i];
	}
	
	public void draw(Graphics g) {
		 int x = GamePanel.DRAWING_WIDTH/2 - 230;
		 int y = GamePanel.DRAWING_HEIGHT - GamePanel.DRAWING_HEIGHT/2;
		 int width = octave[0].getWidth();
		for(int i = 0; i<octave.length; i++) {
			octave[i].draw(g, x, y);
			g.drawString(octave[i].getPianoLetter(), x + 20, y);
			g.drawString(octave[i].getKeyboardLetter(), x + 20, y -30);
			x+= width;
		}
		
		int x2 = 2*width/3 + GamePanel.DRAWING_WIDTH/2 - 230;
		for(int i = 0; i<2; i++) {
			sharps[i].draw(g, x2, y);
			g.drawString(sharps[i].getPianoLetter(), x2 + 10, y);
			g.drawString(sharps[i].getKeyboardLetter(), x2 + 10, y -30);
			x2+= width;
		}
		
		x2 += width;
		for(int i = 2; i<sharps.length; i++) {
			sharps[i].draw(g, x2, y);
			g.drawString(sharps[i].getPianoLetter(), x2 + 10, y);
			g.drawString(sharps[i].getKeyboardLetter(), x2 + 10, y -30);
			x2+= width;
		}
		
		
		
		
	}
	
	
	
	
}
