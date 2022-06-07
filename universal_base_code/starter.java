import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Performer []x = new Performer[4];
		x[0] = new Performer();
		x[1] = new Musician();
		x[2] = new Apprentice();
		x[3] = new Actor();
		
		for(int i = 0; i != x.length; i++){
			System.out.println(x[i]);
		}
		
		System.out.println(x[0].equals(x[1]));
	}
}
