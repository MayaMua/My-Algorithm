/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        

        // if (s.length() != t.length()) {
        //     return false;
        // }

        // int[] letters = new int [26];
        // for (int i = 0; i < s.length(); i++) {
        //     letters[s.charAt(i) - 'a']++;
        //     letters[t.charAt(i) - 'a']--;
        // }
        // for (int letter: letters) {
        //     if (letter != 0)
        //         return false;
        // }
        // return true;

//===========================================================
        // if (s.length() != t.length()) {
        //     return false;
        // }

        // int[] count_s = new int [26];
        // int[] count_t = new int [26];
        
        // for (int i = 0; i < s.length(); i++) {
        //     count_s[s.charAt(i) - 'a']++;
        //     count_t[t.charAt(i) - 'a']++;
        // }
        // for (int i = 0; i < 26; i++) {						//比较两字符表是否相同
        //     if (count_s[i] != count_t[i]) return false;
        // }

        // return true;
//==================================================================
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;

    }
}
// @lc code=end
