import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("type");
		String inp = sc.nextLine();
	

		for(int c =0;c<inp.length();c++){
			System.out.println(inp.substring(c,c+1));
			
		}

		
	}
}
