package piano;

import java.awt.Graphics;

public class Piano {

	private Key[] octave;
	private Key[] sharps;
	
	
	public Piano() {
		Sound s = new Sound("");
		Key c4 = new Key("c4", s, false);
		Key d = new Key("d", s, false);
		Key e = new Key("e", s, false);
		Key f = new Key("f", s, false);
		Key g = new Key("g", s, false);
		Key a = new Key("a", s, false);
		Key b = new Key("b", s, false);
		Key c5 = new Key("c5", s, false);
		
		Key cSharp = new Key("cSharp", s, true);
		Key dSharp = new Key("dSharp", s, true);
		
		Key fSharp = new Key("fSharp", s, true);
		Key gSharp = new Key("gSharp", s, true);
		Key aSharp = new Key("aSharp", s, true);
		
		
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
		 int x = 20;
		 int y = 150;
		 int width = octave[0].getWidth();
		for(int i = 0; i<octave.length; i++) {
			octave[i].draw(g, x, y);
			x+= width;
		}
		
		int x2 = 2*width/3 + 20;
		for(int i = 0; i<2; i++) {
			sharps[i].draw(g, x2, y);
			x2+= width;
		}
		
		x2 += width;
		for(int i = 2; i<sharps.length; i++) {
			sharps[i].draw(g, x2, y);
			x2+= width;
		}
	}
	
	
	
	
}
