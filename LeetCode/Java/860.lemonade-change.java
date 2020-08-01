/*
 * @lc app=leetcode id=860 lang=java
 *
 * [860] Lemonade Change
 */

// @lc code=start
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCounts = 0, tenCounts = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fiveCounts++;
            } else if (bills[i] == 10) {
                if (fiveCounts > 0) {
                    fiveCounts--;
                    tenCounts++;
                } else return false;
            } else if (bills[i] == 20) {
                if (tenCounts > 0 && fiveCounts > 0) {
                    tenCounts--;
                    fiveCounts--;
                }
                else if (fiveCounts > 2) fiveCounts -= 3;
                else return false;
            }
        }
        return true;
    }
}
// @lc code=end

