/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    // public int climbStairs(int n) {
    //     // if(n==1)
    //     //     return 1;
    //     // if(n==2)
    //     //     return 2;
    //     // else
    //     //     return (climbStairs(n-1) + climbStairs(n-2));
        
    //     int memo[] = new int[n+1];
    //     return climbStairsMemo(n, memo);

    // }

    // public int climbStairsMemo(int n, int memo[]) {
    //     if(memo[n]>0)
    //         return memo[n];

    //     if(n==1) {
    //         memo[n] = 1;
    //     }
    //     else if(n==2) {
    //         memo[n] = 2;
    //     }
    //     else {
    //         memo[n] = climbStairsMemo(n-1, memo) + climbStairsMemo(n-2, memo);

    //     }
    //     return memo[n];
    // }


    public int climbStairs(int n) {
        if(n==1)
            return 1;
        int memo[] = new int[n+1];
        memo[1] = 1;
        memo[2] = 2;
        for(int i=3; i<=n; i++) {
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
    }


}
// @lc code=end

