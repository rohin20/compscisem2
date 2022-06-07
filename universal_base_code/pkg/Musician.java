package pkg;
import java.util.Scanner;
import java.util.Random;


public class Musician extends Performer {
	String instrument;

	public Musician() {
		instrument = "cello";
		
	}
	public Musician(String instrument) {
		this.instrument = instrument;
		
	}
	
	public Musician(String n, String i){
		super(n);
		instrument = i;
	}
	public Musician(String n, String i, int a){
		super(n,a);
		instrument = i;
	}
	
	public String getInstrument(){
		return instrument;
	}
	
	public void playInstrument(){
		System.out.println("♬♫♫🎵🎵");
	}
	
	public String toString(){
		return ("name is "+name+" instrument is "+instrument);
	}
}

