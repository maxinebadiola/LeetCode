/*
 * @lc app=leetcode id=1768 lang=cpp
 *
 * [1768] Merge Strings Alternately
 */

// @lc code=start
class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        string result;
        int x = 0, y = 0;

        while (x < word1.length() || y < word2.length()) { //either word needs to be read
            if (x < word1.length()) {
                result += word1[x]; //string[index]
                x++;
            }
            if (y < word2.length()) {
                result += word2[y];
                y++;
            }
        }
        return result;
    }
};
// @lc code=end

