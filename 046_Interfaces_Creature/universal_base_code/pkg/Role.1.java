package pkg;
import java.util.Scanner;
import java.util.Random;


public interface creature{
	boolean isDead()
	boolean takeDamage(int)
	String getName()
	void attack(Role)
}

