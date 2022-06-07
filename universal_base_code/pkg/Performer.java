package pkg;
import java.util.Scanner;
import java.util.Random;


public class Performer {
	String name;
	int age;

	public Performer() {
		name = "doja cat";
		age = 26;
		
	}
	public Performer(String name, int age){
		this.name = name;
		this.age = age;
	}
	public Performer(String name){
		age = 43;
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	public void practice(){
		System.out.println(name+" is practicing");
		
	}
	public void perform(){
		System.out.println(name+"is performing");
		
	}	
	
	public String toString(){
		return ("name is "+name+" age is "+age);
	}
	
	public boolean equals(Object other){
		return this.name==name;
	}
	
}

