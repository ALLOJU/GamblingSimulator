package bridgelabz;

import java.util.Scanner;

public class GamblerUC1 {

	public static void main(String[] args) {

		//input from user taken using scanner object
		Scanner sc=new Scanner(System.in);

		//input from user for both stack value and bets value
		System.out.println("enter stack of every day");
		int stack =sc.nextInt();
		System.out.println("enter bet of every day");

		int bet=sc.nextInt();

		sc.close();
	}
}
