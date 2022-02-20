
package bridgelabz;

import java.util.Scanner;

public class GamblerUC3 {
	public static void main(String[] args) {
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
		int maxstack= currentstack + 50 % stack;
		int minstack= currentstack - 50 % stack;

		while(currentstack <= maxstack &&  currentstack >=minstack)
		{
			//if it is loss
			if(number==0) {
				currentstack= currentstack-bets;				//System.out.println("lose");
			}
			
			//if it is win
			else
			{
				
				currentstack=currentstack+bets;
				//System.out.println("win");
			}
			if(currentstack==stack/2) {
				System.out.println("Gambler would resign for the day as stack decreases to 50% of stack");
				break;
			}
		}
		System.out.println("Current stack value is  "+currentstack);


		sc.close();
	}
}
