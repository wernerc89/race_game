package race_game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Game {

	public static void main(String[] args) throws IOException {

		//initialize objects
		CarA carA = new CarA();
		CarB carB = new CarB();
		CarC carC = new CarC();
		CarD carD = new CarD();

		//file read operation
		//add your windows user to file destination string (replacing the '????')
		BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\????\\Desktop\\track.txt"));
		String str;
		String theTrack = null;
		//loop and add file characters to string
		while ((str = in.readLine()) != null) {
			theTrack = str;
		}

		//loop through track
		for (int i = 0; i < theTrack.length(); i++) {
			char c = theTrack.charAt(i);
			// Process char
			if (c == '0') {
				//call method with straight line param
				carA.accelarate(0);
				carB.accelarate(0);
				carC.accelarate(0);
				carD.accelarate(0);
			} else if (c == '1') {
				//call method with straight line param
				carA.accelarate(1);
				carB.accelarate(1);
				carC.accelarate(1);
				carD.accelarate(1);
			} else {
				//check for invalid chars
				System.out.println("Invalid Character : "+ c);
			}

		}
		System.out.println(carA.currentSpeed);
		System.out.println(carB.currentSpeed);
		System.out.println(carC.currentSpeed);
		System.out.println(carD.currentSpeed);
	    
	}
}
