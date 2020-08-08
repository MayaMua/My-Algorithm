import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

// @lc code=start
class Solution {
    // public List<String> generateParenthesis(int n) {
    //     _generate(0, 2*n, "");
    //     return null;
    // }
    // private void _generate(int , int max, String s) {
    //     // terminator
    //     if(level >= max) {
    //         return;
    //     }
    //     // process current logic: left, right
    //     String s1 = s + "(";
    //     String s2 = s + ")";

    //     // drill down
    //     _generate(level+1, max, s1);
    //     _generate(level+1, max, s2);
    //     // reverse states
        

    // }
    private List<String> result;

    public List<String> generateParenthesis(int n) {
        result = new ArrayList<String>();
        _generate(0, 0, n, "");
        return result;
    }
    
    private void _generate(int left, int right, int n, String s) {
        // terminator
        if(left==n && right==n) {
            result.add(s);
            return;
        }
        // process current logic: left, right

        // drill down
        if(left<n)
            _generate(left+1, right, n, s + "(");
        if(left>right)
            _generate(left, right+1, n, s + ")");
        // reverse states
        

    }
}
// @lc code=end

