import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode id=239 lang=java
 *
 * [239] Sliding Window Maximum
 */

// @lc code=start
class Solution {
    // public int[] maxSlidingWindow(int[] nums, int k) {
    //     if (k == 1) return nums;
    //     int n = nums.length;
    //     int[] res = new int[n - k + 1];
    //     Deque<Integer> window = new LinkedList<>();
    //     // 单调递减队列
    //     // 初始化双端队列
    //     for (int i = 0; i < k; i++) {
    //         while (!window.isEmpty() && nums[window.getLast()] <= nums[i]) {
    //             window.removeLast();
    //         }

    //         window.addLast(i);
    //     }

    //     res[0] = nums[window.getFirst()];

    //     for (int i = k; i < nums.length; i++) {
    //         // [i...i+k-1]
    //         // 清楚不在当前窗口的最大元素
    //         while (!window.isEmpty() && window.getFirst() < i - k + 1) {
    //             window.removeFirst();
    //         }
    //         // 为了使得对手元素永远是窗口的最大元素
    //         // 维持单点递减队列
    //         while (!window.isEmpty() && nums[window.getLast()] <= nums[i]) {
    //             window.removeLast();
    //         }
    //         window.addLast(i);
    //         res[i - k + 1] = nums[window.getFirst()];
    //     }
    //     return res;
    // }

    /**
     * 我们并不需要把滑动窗口的每个数值都存入队列中，
     * 而只把有可能成为滑动窗口最大值的数值存入到一个双端队列中。
     * 当前队列的头位置上的元素就是当前滑动窗口的最大值。
     * 为了保证双端队列中保存的元素都是当前滑动窗口的元素，
     * 可以将元素的角标保存到滑动窗口中，这样就方便判断了。
     */


    ArrayDeque<Integer> deq = new ArrayDeque<Integer>();
    int [] nums;
  
    public void clean_deque(int i, int k) {
      // remove indexes of elements not from sliding window
      if (!deq.isEmpty() && deq.getFirst() == i - k) {
        deq.removeFirst();
      }

  
      // remove from deq indexes of all elements 
      // which are smaller than current element nums[i]
      while (!deq.isEmpty() && nums[i] > nums[deq.getLast()]){
        deq.removeLast();
      }                       
    }
  
    public int[] maxSlidingWindow(int[] nums, int k) {
      int n = nums.length;
      if (n * k == 0) return new int[0];
      if (k == 1) return nums;
  
      // init deque and output
      this.nums = nums;
      int max_idx = 0;
      for (int i = 0; i < k; i++) {
        clean_deque(i, k);
        deq.addLast(i);
        // compute max in nums[:k]
        if (nums[i] > nums[max_idx]) max_idx = i;
      }
      int [] output = new int[n - k + 1];
      output[0] = nums[max_idx];
  
      // build output
      for (int i  = k; i < n; i++) {
        clean_deque(i, k);
        deq.addLast(i);
        output[i - k + 1] = nums[deq.getFirst()];
      }
      return output;
    }
}
// @lc code=end

