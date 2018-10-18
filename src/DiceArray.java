/**
 * 
 * @author jeremy
 *
 */
public class DiceArray
{
	
	public static void main(String[] args)
	{
		DiceClass[] diceArray = new DiceClass[2];
		int[] rollCounts = new int[11];
		
		// initialize with dice
		for(int i = 0; i < diceArray.length; i++)
		{
			diceArray[i] = new DiceClass();
		}
		
		// roll and count each how many times each number was rolled
		for(int i = 0; i <= 10; i++)
		{
			int currentRoll = diceArray[0].roll() + diceArray[1].roll();
			rollCounts[currentRoll - 2]++;
		}
		
		// print how many times for each
		for(int i = 0; i < rollCounts.length; i++)
		{
			System.out.printf("Number %d rolled %d times\n", i + 2, rollCounts[i]);
		}
		
		
	
	}
	
}
