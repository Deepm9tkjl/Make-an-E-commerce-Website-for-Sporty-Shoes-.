package softnerv;

public class buy {


	static int maxProfit(int prices[], int n)
	{
		int minsofor= prices[0], max_profit = 0;
		for (int i = 0; i < n; i++) {

	minsofor=Math.min(minsofor,prices[i]);
			int profit=prices[i]-minsofor;
			max_profit=Math.max(max_profit,profit);
			}
		
		return max_profit;
	}

	public static void main(String args[])
	{
		int prices[] = { 7, 1, 5, 6, 4 };
		int n = prices.length;
		int max_profit = maxProfit(prices, n);
		System.out.println(max_profit);
	}
	}

