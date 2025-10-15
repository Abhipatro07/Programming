/*
Test Cases for find_stock_buy_sell_profit:

1. Input: [100, 180, 260, 310, 40, 535, 695]
   Expected Output: Buy on day 0, sell on day 3; Buy on day 4, sell on day 6
   Explanation: Buy low and sell high twice → total profit = (310-100) + (695-40) = 865

2. Input: [100, 90, 80, 70]
   Expected Output: No transactions
   Explanation: Prices continuously decrease → no profit possible

3. Input: [1, 2, 3, 4, 5]
   Expected Output: Buy on day 0, sell on day 4
   Explanation: Prices continuously increase → buy first day, sell last day → profit = 4

4. Input: [5, 4, 3, 2, 1]
   Expected Output: No transactions
   Explanation: Prices continuously decrease → no profit possible

5. Input: [100, 180, 260, 310, 40, 535, 695, 10, 50]
   Expected Output: Buy on day 0, sell on day 3; Buy on day 4, sell on day 6; Buy on day 7, sell on day 8
   Explanation: Multiple profitable segments exist

6. Input: [1, 2]
   Expected Output: Buy on day 0, sell on day 1
   Explanation: Only two days, buy first, sell second

7. Input: [2, 1]
   Expected Output: No transactions
   Explanation: Only two days, prices go down → no profit

8. Input: [1, 2, 1, 2, 1, 2]
   Expected Output: Buy on day 0, sell on day 1; Buy on day 2, sell on day 3; Buy on day 4, sell on day 5
   Explanation: Alternating prices → multiple small profits

9. Input: [100]
   Expected Output: No transactions
   Explanation: Only one day → cannot buy and sell

10. Input: []
    Expected Output: No transactions
    Explanation: Empty price list → cannot buy or sell
*/

package Arrays;

import java.util.Scanner;

public class find_stock_buy_sell_profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int n = sc.nextInt();
        int prices[] = new int[n];

        System.out.println("Enter the stock prices for each day: ");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        findBuySell(prices, n);
    }

    public static void findBuySell(int[] prices, int n) {
        if (n == 0) {
            System.out.println("No transactions possible");
            return;
        }

        int i = 0;
        boolean found = false;

        while (i < n - 1) {
            // Find the local minima (buy day)
            while (i < n - 1 && prices[i + 1] <= prices[i]) {
                i++;
            }
            if (i == n - 1) break;
            int buy = i++;
            
            // Find the local maxima (sell day)
            while (i < n && prices[i] >= prices[i - 1]) {
                i++;
            }
            int sell = i - 1;

            System.out.println("Buy on day " + buy + " at price " + prices[buy] +
                               " | Sell on day " + sell + " at price " + prices[sell]);
            found = true;
        }

        if (!found) {
            System.out.println("No transactions possible");
        }
    }
}
/* How this works:

 Loops through the price array.
 Finds local minima → buy day.
 Finds local maxima after that → sell day.
 Prints all profitable buy/sell pairs.
 If no profit is possible, prints "No transactions possible".

*/