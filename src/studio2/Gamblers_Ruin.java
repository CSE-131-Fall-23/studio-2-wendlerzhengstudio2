package studio2;

import java.util.Scanner;

public class Gamblers_Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Start amount:");

		for(int x = 1;x<= 500;x++)
			
		{
			int startAmount = 2;
			double winChance = 0.7;
			int winLimit = 10;
			boolean win = true;
			
			while ((startAmount < winLimit)&&(startAmount > 0))
			{
				//boolean win = true;
				Double actual_chance = Math.random();
				if(actual_chance >= winChance)
				{
					
					startAmount++;
					//System.out.println("")
				}
				else
				{
					win = false;
					startAmount--;
				}
				
			}
			if( win == true)
			{
				System.out.println("Simulation: "+x+ startAmount +"WIN");
			}
			else
			{
				System.out.println("Simulation: "+x+' '+ startAmount +" LOSE");
			}
			
			
		}
		
		
		//if(startAmount)
		//System.out.println("Total simulation:"+count);
		
	}

}
