import java.util.ArrayList;
import java.util.List;

import jdk.internal.jshell.tool.resources.version;

/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null) return ans;
        dfs(ans, nums, new ArrayList<Integer>(), 0);
        return ans;
    }

    private void dfs(List<List<Integer>> ans, int[] nums, List<Integer> list, int index) {
        if (index == nums.length) {
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        dfs(ans, nums, list, index+1); // not pick the number at this index
        list.add(nums[index]);
        dfs(ans, nums, list, index+1); // pick

        list.remove(list.size()-1);
    }
}
// @lc code=end

