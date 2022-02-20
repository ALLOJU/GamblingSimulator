package bridgelabz;

import java.util.Scanner;

public class GamblerUC4 {
	public static void main(String[] args) {
		 
		//input from user taken using scanner object
		Scanner sc=new Scanner(System.in);

		//input from user for both stack value and bets value
		System.out.println("enter stack of every day");
		int stack =sc.nextInt();

		System.out.println("enter bet of every day");
		int bets=sc.nextInt();

		int currentstack=stack;
		int number=(int)Math.floor(Math.random()*10) % 2;
		int maxWon=0,won=0,daysWon=0;
		int maxLoss=0,daysLoss=0;
		int amount20Days=0;
		int totalGames=0,lostGames=0,wonGames=0;
		//maximum stack value and minimum stack value taken
		int maxstack= currentstack + 50 % currentstack;
		int minstack= currentstack - 50 % currentstack;
		for(int i=1;i<=20;i++) {
			while(currentstack < maxstack && currentstack > minstack) {
				if(number==0) {
					//System.out.println("Gambler Loss");
					currentstack=currentstack-bets;
					 maxLoss++;lostGames++;
				}
				else
				{
					//System.out.println("Gambler Win");
					currentstack=currentstack+bets;
					 maxWon++;wonGames++;
				}
				if(currentstack==stack/2) {
					System.out.println("Gambler would resign for the day as stack decreases to 50% of stack");
					break;
				}
			}
			amount20Days=maxWon>maxLoss?maxWon-maxLoss:maxLoss-maxWon;
			if(wonGames>lostGames)
				daysWon++;
			else
				daysLoss++;
		}
		if(maxWon>maxLoss)
		System.out.println("Total Amount Won for 20 days is:"+amount20Days);
		else
		System.out.println("Total Amount Loss for 20 days is:"+amount20Days);
	
		
		//System.out.println("Current stack value is  "+currentstack);


		sc.close();
	}
}
