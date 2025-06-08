package com.testing.modules.arrays;

public class StockBuyandSellMax {

	public static void main(String[] args) {
		int prices[] = { 7, 10, 1, 3, 6, 9, 2 };
		int max = maximumProfit(prices);
	}

	private static int maximumProfit(int[] prices) {
		int maxprofit = 0;
		int minprice = prices[0];
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < minprice) {
				minprice = prices[i];
			} else {
				int profit = prices[i] - minprice;
				if (profit > maxprofit) {
					maxprofit = profit;
				}
			}
		}
		return maxprofit;


	}
}