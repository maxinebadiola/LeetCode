/*
 * @lc app=leetcode id=1768 lang=kotlin
 *
 * [1768] Merge Strings Alternately
 */

// @lc code=start
class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        
        var string1 = word1
        var string2 = word2
        var result = ""

        while (string1.isNotEmpty() || string2.isNotEmpty())
        {
            if (string1.isNotEmpty()) {
                result += string1.first()
                string1 = string1.drop(1)
            }
            if (string2.isNotEmpty()){
                result += string2.first()
                string2 = string2.drop(1)
            }
        }
        return result
    }
}
// @lc code=end

