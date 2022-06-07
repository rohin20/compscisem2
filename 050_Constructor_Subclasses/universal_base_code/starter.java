import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Musician x = new Musician("kanye","violin");
		Musician y = new Musician("dababy","piano", 38);
		
		x.getName();
		x.practice();
		x.getInstrument();
		
		y.getName();
		y.perform();
		System.out.println(y.getInstrument());
		
		
		


		
	}
}
