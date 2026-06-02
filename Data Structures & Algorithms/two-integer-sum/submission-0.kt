class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numMap = mutableMapOf<Int, Int>()
        val result = IntArray(2)
        nums.forEachIndexed { index, num -> 
            val other = target - num
            if(numMap.containsKey(other)) {
                val otherIndex = numMap[other] ?: 0 
                return result.apply {
                    if(index > otherIndex) {
                        this[0] = otherIndex
                        this[1] = index
                    } else {
                        this[0] = index
                        this[1] = otherIndex
                    }
                }
            } else {
                numMap[num] = index
            }
        }
        return result
    }
}
