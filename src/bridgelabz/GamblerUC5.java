package bridgelabz;

import java.util.Scanner;

public class GamblerUC5 {
	public static void main(String[] args) {

		int no_of_days=30;
		
		
		//input from user taken using scanner object
		Scanner sc=new Scanner(System.in);

		//input from user for both stack value and bets value
		System.out.println("enter stack of every day");
		int stack =sc.nextInt();

		System.out.println("enter bet of every day");
		int bets=sc.nextInt();

		int currentstack=stack;
		

		//maximum stack value and minimum stack value taken
		int maxstack= currentstack + 50 % currentstack;
		int minstack= currentstack - 50 % currentstack;
		int maxWon=0,won=0,daysWon=0;
		int maxLoss=0,daysLoss=0;
		int totalGames=0,lostGames=0,wonGames=0;

	
		for(int i=1;i<=30;i++)
		{
			while(currentstack < maxstack && currentstack > minstack) 
			{
			   int number=(int) (Math.floor(Math.random()*10) % 2);
				//System.out.println("number:: "+number);
					if(number==0)
					{
						currentstack=currentstack-bets; 
						maxLoss++; lostGames++;
					}
					else
					{
						currentstack=currentstack+bets; 
						maxWon++;wonGames++;
					}
				if(stack/2==currentstack)
					break;
			}
			//System.out.println("Total::"+totalGames+"---Lost :"+lostGames);
			if(wonGames>lostGames)
				daysWon++;
			else
				daysLoss++;
			//System.out.println("currentstack--"+currentstack);
			
		}
		
		 int amount30Days=maxWon>maxLoss?maxWon-maxLoss:maxLoss-maxWon;
		
			System.out.println("For 1 month,Days won is:"+daysWon+" & amount is:"+maxWon);
			System.out.println("For 1 month,Days lost is:"+daysLoss+" & amount is:"+maxLoss);
		
	
	}
		
	}

