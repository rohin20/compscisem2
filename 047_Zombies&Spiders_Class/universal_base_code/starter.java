import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		creature a = new Zombie();
		creature b = new Spider();
		Role x = new Rogue();
		while(a.isDead() == false){
			x.attack(a);
		}
		
		
	}
}
