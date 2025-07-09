/*
 * @lc app=leetcode id=2239 lang=kotlin
 *
 * [2239] Find Closest Number to Zero
 */

// @lc code=start
import kotlin.math.abs //absolute value = distance from zero (regardless of sign)

class Solution {
    fun findClosestNumber(nums: IntArray): Int { //"nums" = entry
        var value = nums[0] //get first index
        for (n in nums) //loop through all numbers
        {   
            //lowest possible value
            if (n == 0) {
                return 0
            }
            //eg. abs (2) < abs (3) = TRUE so value = 2
            //but if abs(1) < (-1) = FALSE, -> check if same value, pick positive
            if (abs(n) < abs(value) || (abs(n) == abs(value) && n > value)) {
                value = n 
            }
        }
        return value
    }
}
// @lc code=end

