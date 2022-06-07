package pkg;
import java.util.Scanner;
import java.util.Random;


public class Actor extends Performer{
	String type;

	public Actor() {
		type = "theater";
		
	}
	
	public Actor(String t, String n){
		type = t;
		name = n;
	}

	public void practice(){
		System.out.println(super.getName()+" is doing practice");
	}

	public void perform(){
		System.out.println("♪┏(・o･)┛♪┗ ( ･o･) ┓♪");
		
	}
	
	public void monologue(){
		System.out.println("I miss the old Kanye, straight from the Go Kanye Chop up the soul Kanye, set on his goals Kanye");
	}
}

