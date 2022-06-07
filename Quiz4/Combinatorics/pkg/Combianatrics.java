package pkg;
import java.util.Scanner;
import java.util.Random;


public class Combianatrics {
	Scanner sc = new Scanner(System.in);
	int ans;
	public static int factorial(int){
		int inp = sc.nextInt();
		int x = inp;
		while(x!=0){
			ans = x*inp;
			x = x-1;
		}
		return ans;
	}

}
