import java.util.concurrent.atomic.LongAccumulator;

import javax.lang.model.element.Element;

/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start

// 二分：x>0 单调

class Solution {
    public int mySqrt(int x) {
        if (x == 1 || x == 0) return x;
        
        long tmp, left = 1, right = x, mid;
        while (left <= right) {
            mid = (right - left) / 2 + left;
            tmp = mid * mid;
            if (tmp - x > 1) right = mid - 1;
            else left = mid + 1;
        }

        return (int) right;
    }


}
// @lc code=end

