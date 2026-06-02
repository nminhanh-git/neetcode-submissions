class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val numbMap = mutableMapOf<Int, Int>()
         nums.forEach { num ->
            if(numbMap[num] != null) return true
            else numbMap[num] = 1
         }
         return false
    }
}
