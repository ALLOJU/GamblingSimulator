package bridgelabz;

import java.util.Scanner;

public class GamblerUC2 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("enter stack of every day");
		int stack =sc.nextInt();
		System.out.println("enter bet of every day");
		int bets=sc.nextInt();
		int currentstack=stack;
		/*
		 * generate random value for both won or loss it depends on getting 1 means won
		 * and 0 means loss
		 */
		int number=(int)Math.floor(Math.random()*10) % 2;
		//System.out.println(number);
		if(number==0) {
			currentstack= currentstack-bets;
		}
		else
		{
			
			currentstack=currentstack+bets;
		}
		System.out.println("Current stack is  "+currentstack);
		sc.close();
	}
}
