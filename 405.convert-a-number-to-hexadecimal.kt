/*
 * @lc app=leetcode id=405 lang=kotlin
 *
 * [405] Convert a Number to Hexadecimal
 */

// @lc code=start
class Solution {
    fun toHex(num: Int): String {
        if (num == 0) 
            return "0"
        
        var n = num
        var hex = ""
        
        while (n != 0) { //binary val is NOT leading 0s
            //get least sig nibble with formula:  mask = (1 << i) - 1; x &= mask;
            //https://www.geeksforgeeks.org/competitive-programming/bit-tricks-competitive-programming/
            val nibble = n and ((1 shl 4) - 1)  
            hex = when (nibble) 
            {
                10 -> "a"
                11 -> "b"
                12 -> "c"
                13 -> "d"
                14 -> "e"
                15 -> "f"
                else -> nibble.toString()
            } + hex
            n = n ushr 4 //unsigned 
        }
        return hex
    }
}
// @lc code=end