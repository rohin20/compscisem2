package pkg;
import java.util.Scanner;
import java.util.Random;


public class HorseBarn{
	private Horse[] spaces;
	
	
	public int findHorseSpace(String name){
		for(int i = 0; i = spaces.length; i++){
			if(spaces[i].getName().equals(name)){
				return i;
			}
			
		}
		return -1;
	}

	public void consolidate(){
		int c = 0;
		Horse [] thing = new Horse[spaces.length];
		for(int i = 0; i=spaces.length; i++){
			if(!"null".equals(spaces[i].getName())){
				thing[c] == spaces[i].getName();
				c++;
			}
			
		}
		
	}

}
