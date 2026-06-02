class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val numbMap = mutableMapOf<Int, Int>()
         nums.forEach { num ->
            numbMap[num] = (numbMap[num] ?: 0) + 1
         }
         return numbMap.values.find { it > 1} != null 
    }
}
