package piano;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tester {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		   while (line.equalsIgnoreCase("quit") == false) {
		       line = in.readLine();
		       if (line.equals("S")) {
		    	   System.out.print("pressed");
		    	   SoundClipTest newSound = new SoundClipTest();
		    	   newSound.playSound();
		       }
		       //do something
		   }

		   in.close();
	}
}
