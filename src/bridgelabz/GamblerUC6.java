package bridgelabz;

import java.util.Scanner;

public class GamblerUC6 {
	public static void main(String[] args) {

		int no_of_days=30;
		
		int maxWon=0,won=0,daysWon=0;
		int maxLoss=0,daysLoss=0;
		int amount20Days=0;
		int totalGames=0,lostGames=0,wonGames=0;
		int unluckiestDay=0, luckiestDay=0;
		//input from user taken using scanner object
		Scanner sc=new Scanner(System.in);

		//input from user for both stack value and bets value
		System.out.println("enter stack of every day");
		int stack =sc.nextInt();

		System.out.println("enter bet of every day");
		int bets=sc.nextInt();

		int currentstack=stack;
		
		
		double number=Math.floor(Math.random()*10) % 2;

		//maximum stack value and minimum stack value taken
		int maxstack= currentstack + 50 % currentstack;
		int minstack= currentstack - 50 % currentstack;
		for(int i=1;i<=no_of_days;i++) {
			while(currentstack < maxstack && currentstack > minstack) {
				if(number==0) {
					currentstack=currentstack-bets; 

					maxLoss++; lostGames++;					//System.out.println("Gambler Loss");
					
				}
				else
				{
					currentstack=currentstack+bets; 
					maxWon++;wonGames++;
				}
				if(currentstack==stack/2) {
					System.out.println("Gambler would resign for the day as stack decreases to 50% of stack");
					break;
				}
			}
			if(maxWon>maxLoss) {
				luckiestDay=i;
			}
			else {
				daysLoss++;unluckiestDay=i;
			}
		}
			System.out.println("Luckiest Day Max Won on "+luckiestDay+" day.");
			System.out.println("unluckiest Day Max Lost on "+unluckiestDay+" day.");
		
		


		sc.close();
	}
}
