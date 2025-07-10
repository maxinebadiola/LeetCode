/*
 * @lc app=leetcode id=13 lang=kotlin
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    fun romanToInt(s: String): Int {
        var total = 0
        var count = 0
        val values = mapOf( 
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )
        while (count < s.length) {
            val currentChar = s[count]
            val currentValue = values.getValue(currentChar)
            var nextChar = ' '
            var nextValue = 0
            if (count + 1 < s.length) {
                nextChar = s[count + 1]
                nextValue = values.getValue(nextChar)
            }
            if (currentValue < nextValue) { //subtraction cases (eg. IV etc.)
                total -= currentValue
            } 
            else {
                total += currentValue
            }
            count++
        }
        return total
    }
}
// @lc code=end

