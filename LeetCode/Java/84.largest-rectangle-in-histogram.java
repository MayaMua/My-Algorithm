/*
 * @lc app=leetcode id=84 lang=java
 *
 * [84] Largest Rectangle in Histogram
 */

// @lc code=start
class Solution {
    // public int largestRectangleArea(int[] heights) {
    //     if (heights == null || heights.length == 0) {
    //         return 0;
    //     }
    //     Stack<Integer> stack = new Stack<Integer>();
    //     int ans = 0;
    //     for (int i = 0; i<= heights.length; i++) {
    //         int cur = (i == heights.length) ? -1 : heights[i];
    //         while (!stack.isEmpty() && heights[stack.peek()] >= cur) {
    //             int h = heights[stack.pop()];
    //             int w = stack.isEmpty() ? i : i - stack.peek() - 1;
    //             ans = Math.max(ans, h * w);
    //         }
    //         stack.push(i);
    //     }
    //     return ans;
    // }

    public static int largestRectangleArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int[] lessFromLeft = new int[height.length]; // idx of the first bar the left that is lower than current
        int[] lessFromRight = new int[height.length]; // idx of the first bar the right that is lower than current
        lessFromRight[height.length - 1] = height.length;
        lessFromLeft[0] = -1;
    
        for (int i = 1; i < height.length; i++) {
            int p = i - 1;
    
            while (p >= 0 && height[p] >= height[i]) {
                p = lessFromLeft[p];
            }
            lessFromLeft[i] = p;
        }
    
        for (int i = height.length - 2; i >= 0; i--) {
            int p = i + 1;
    
            while (p < height.length && height[p] >= height[i]) {
                p = lessFromRight[p];
            }
            lessFromRight[i] = p;
        }
    
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            maxArea = Math.max(maxArea, height[i] * (lessFromRight[i] - lessFromLeft[i] - 1));
        }
    
        return maxArea;
    }
}
// @lc code=end

