import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Musician x = new Musician();
		Musician y = new Musician("violin");
		Performer a = new Performer();
		Performer b = new Performer("kanye",32);
		
		System.out.println(a.getName());
		a.practice();
		System.out.println(b.getName());
		b.perform();
		
		System.out.println(x.getName());
		x.perform();
		x.playInstrument();
		y.practice();
		y.getInstrument();
		


		
	}
}
