import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name");
		String name = sc.nextLine();
		System.out.println("What is your age");
		int age = sc.nextInt();
		System.out.println("What is your birthday month(1-12)");
		int month = sc.nextInt();
		System.out.println("What is your birth day (1-31)");
		int day = sc.nextInt();
		System.out.println("What is your birth year");
		int year = sc.nextInt();
		System.out.println("How much is a buck fifty");
		double money = sc.nextDouble();
		System.out.println("Your name is "+name+" and you were born on "+month+"/"+day+"/"+year);
		System.out.println("You are "+age+" years old!!!!");
		System.out.println("you have $"+money+" in your wallet");
	}
}
