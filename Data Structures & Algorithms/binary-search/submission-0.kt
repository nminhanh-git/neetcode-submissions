class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            val mid: Int = left + (right - left)/2
            val valueMid = nums[mid]
            println("left: $left, right: $right")
            when {
                valueMid == target -> return mid
                valueMid < target -> {
                    left = mid + 1
                }
                valueMid > target -> {
                    right = mid - 1
                }
            }
        }
        return -1
    }
}
