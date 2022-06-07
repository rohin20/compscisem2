package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name!
	int age;			// How many times should it be printed
	String villain;		// Who's the arch nemesis of this Spiderman

	public Spiderman() {			// Default constructor!
		this(46,"tom holland", "green goblin");
	}
	
	public Spiderman(String actor){
		this.actor = actor;
		age = 30;
		villain = "gren goblin";
	}
	
	public Spiderman(int age){
		this(age, "tom holland", "grengolbin")
	}
	public Spiderman(int age, String actor){
		this.age = age;
		this.actor = actor;
		villain = "gren goblin";
	}
	public Spiderman(int age, String actor, String villain){
		this.age = age;
		this.actor = actor;
		this.villain = villain;
		this.printArt();
	}
	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.


	public void setActor(String actor){
		this.actor = actor;
	}
	public void setAge(int actor){
		this.age = age;
	}
	public void setVillain(String villain){
		this.villain = villain;
	}
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	public int getAge(){
		return this.age;
	}
	public String getVillain(){
		return this.villain;
	}
	public void getActor(){
		return this.actor;
	}

	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}

	

}
