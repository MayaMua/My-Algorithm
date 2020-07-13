/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    // public List<List<Integer>> threeSum(int[] nums) {
    //     if(nums == null || nums.length <= 2) {
    //         return Collections.emptyList();
    //     }
    //     // Arrays.sort(nums);
    //     Set<List<Integer>> result = new LinkedHashSet<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i+1; j < nums.length; j++) {
    //             for (int k = j+1; k<nums.length; k++) {
    //                 if (nums[i] + nums[j] + nums[k] == 0) {
    //                     List<Integer> value = Arrays.asList(nums[i], nums[j], nums[k]);  // 排序放好
    //                     result.add(value);
    //                  }
    //             }
    //         }
    //     }
        
    //     return new ArrayList<>(result);
    // }



    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        
        List<List<Integer>> res = new ArrayList<>();
        for (int k = 0; k < nums.length - 2; k++) {
            if(nums[k] > 0) break;
            if(k > 0 && nums[k] == nums[k - 1]) continue;
            int i = k + 1, j = nums.length - 1;
            while(i < j) {
                int sum = nums[k] + nums[i] +nums[j];
                if (sum < 0) {
                    while (i < j && nums[i] == nums[++i]);
                } else if (sum > 0) {
                    while (i < j && nums[j] == nums[--j]);
                } else {
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[i], nums[j])));
                    while (i < j && nums[i] == nums[++i]);
                    while (i < j && nums[j] == nums[--j]);
                }
            }
        }
        return res;
    }

}
// @lc code=end

