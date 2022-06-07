package pkg;
import java.util.Scanner;
import java.util.Random;


public interface Role{
	public int getHealth();
	public void setHealth(int a);
	public String getName();
	public void printArt();
	public boolean attack(creature a);
}