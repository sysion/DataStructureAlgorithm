import java.io.OutputStream;
import java.util.ArrayList;

public class CoinChange {

	public static void main(String[] args){
		//int[] coinChange = { 1, 2, 3, 4, 5 };
		//int coinSum = 6;
		//int[] coinChange = { 1, 2, 5 };
		//int coinSum = 5;		//solution = 4
		//int[] coinChange = { 1, 2, 3 };
		//int coinSum = 4;		//solution = 4
		//int[] coinChange = { 2, 5, 8 };
		//int coinSum = 10;		//solution = 2
		int[] coinChange = { 2, 5, 10 };
		int coinSum = 6;		//solution = 0

		CoinChangeCombination(coinChange, coinSum);
	}

	public static int CoinChangeCombination(int[] coins, int amount){
		int numberOfCombination = 1999999999;
		int numberOfChange = 0;

		if (amount == 0) {
			numberOfCombination = 0;
		}
		else {
			for (int coin : coins){
				//System.out.println(coin);
				if (amount - coin >= 0) {
					//numberOfChange = CoinChangeCombination(coins, amount - coin) + 1;
					numberOfChange += 1;
					CoinChangeCombination(coins, amount - coin);

					if (numberOfChange < numberOfCombination) {
						numberOfCombination = numberOfChange;
					}
				}
			}
		}
		
    
		System.out.println("numberOfCombination = "+numberOfCombination);

		return numberOfCombination;
	}

}//

