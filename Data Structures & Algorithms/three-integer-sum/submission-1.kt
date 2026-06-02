class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        nums.sort()

        for(i in nums.indices) {
            if(nums[i] > 0) break
            if(i > 0 && nums[i] == nums[i-1]) continue
            var j = i + 1
            var k = nums.size - 1
            while(j < k) {
                val sum = nums[i] + nums[j] + nums[k]
                when {
                    sum > 0 -> k--
                    sum < 0 -> j++
                    else -> {
                        result.add(listOf(nums[i], nums[j], nums[k]))
                        j++
                        k--
                        while(j < k && nums[j] == nums[j-1]) {
                            j++
                        }
                    }
                }
            }
        }
        return result
    }
}
