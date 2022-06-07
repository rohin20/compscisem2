import pkg.*;
import java.util.Scanner;
import java.util.Random;



class starter {
	public static int factorial(int y){
		int x = y;
		while(x != 1){
			x = x-1;
			y = y*x;
		
		}
		return y;
}

	public static void numCombinations(int n, int r){
		int ans;
		if(r>n){
			System.out.println("there are 0 ways of choosing "+r+" items from "+n+" choices.");
		}
		else{
			ans =factorial(r)*factorial(n-r);
			ans = factorial(n)/ans;
			System.out.println("there are "+ans+" ways of choosing "+r+" items from "+n+" choices.");
		}
	}

		
	public static void main(String args[]) {
		// Your code goes below here
		int h = factorial(5);
		System.out.println(h);
		
		
		numCombinations(5,3);


		
	}
}
