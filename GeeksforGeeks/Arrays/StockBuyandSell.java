package com.testing.modules.arrays;

public class StockBuyandSell {

	public static void main(String[] args) {

		int prices[] = { 100, 180, 260, 310, 40, 535, 695 };

		maximumProfit(prices);
	}

	private static void maximumProfit(int[] prices) {
		int profit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				profit += prices[i] - prices[i - 1];
			}

		}
	}
}

