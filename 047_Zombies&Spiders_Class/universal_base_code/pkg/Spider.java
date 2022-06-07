package pkg;
import java.util.Scanner;
import java.util.Random;



public class Spider implements creature{
    Random rand = new Random();
    String name;
    int health;
    int attack;
    
    public Spider(){
        name = "charlotte";
        health = rand.nextInt(5)+5;
        attack  = rand.nextInt(6)+5;
    }
    public boolean isDead(){
        if(health<=0){
            return true;
        }
        return false;
    }
    public boolean takeDamage(int x){
        health = health-x;
        if(this.isDead()){
            return true;
        }
        return false;
    }
    public String getName(){
        return name;
    }
	public void attack(Role a){
	    int hp = a.getHealth();
		hp = hp-attack;
		a.setHealth(hp);
	}
}