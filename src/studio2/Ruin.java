package studio2;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("how manyu moneys u start");
		double startAmount = in.nextDouble();
		double balance = startAmount;
		System.out.println("how many moneys limit when u leave");
		double winLimit = in.nextDouble();
		System.out.println("How often u win (%)");
		double winChance = in.nextDouble()/100.0;
		System.out.println("how manyu simluations u want play");
		int totalSimulations = in.nextInt();
		int day = 0;
		int gamesPlayed = 0;
		int gameCounter=0;
		double totalBalance = balance;
	
		//simulated games until limit
		for (int i=0; i<=totalSimulations; i++) {
			gameCounter=0;
			while (balance < winLimit && balance > 0) {
				//game time
				double gameChance = Math.random();
				if (gameChance <= winChance) {
					balance++;
				}
				else if (gameChance > winChance) {
					balance--;
				}
			gameCounter++;
			}
			day++;
			if (balance >= winLimit) {
				System.out.println("day "+ day + " you played "+ gameCounter +" games" + ": You win");
			totalBalance = totalBalance + balance;
			}
			
			if (balance <= 0 ) {
				System.out.println("day "+ day + " you played "+ gameCounter +" games" + ": You lose");
			totalBalance = totalBalance - startAmount;
			}
			balance = startAmount;
		}
	
				
		System.out.println("You played " + totalSimulations + " days and ended with $" + totalBalance + " in total");
	/* double expectedRuin;
	double a = (1-winChance)/winChance;
	
		if (winChance == 0.5) {
		expectedRuin = 1-(startAmount/winLimit);
	}
	else {
		expectedRuin=((a^startAmount)-(a^winLimit)/(1-(a^winLimit)));
	} 
	System.out.println("expected ruin = " + expectedRuin);		
		
	*/	
		

	}

}
