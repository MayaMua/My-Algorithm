/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        // 只要后一个数字大于前一个数字就可以买入
        int amount = 0;
        int pre, cur;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i] < prices[i+1])
                amount += prices[i+1] - prices[i];
        }
        return amount;
    }
}
// @lc code=end

