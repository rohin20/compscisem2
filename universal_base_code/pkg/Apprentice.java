package pkg;
import java.util.Scanner;
import java.util.Random;


public class Apprentice extends Musician{
	String School;
	int YearsofExperience;

	public Apprentice() {
		School = "cvhs";
		YearsofExperience = 0;
	}
	
	
	public void practiceatUniversity(){
		System.out.println("bleep daleep");
	}

	public String toString(){
		return ("name is "+name+" instrument is "+instrument+ " university is "+School);
	}


}

