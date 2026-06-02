class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val frequencyMap = mutableMapOf<Int, Int>()
        nums.forEach { num ->
            frequencyMap[num] = frequencyMap.getOrPut(num) {0} + 1
        }

        val topKFrequentList = 
        frequencyMap.toList()
            .sortedByDescending { it.second }
            .take(k)
            .map { it.first }

        return IntArray(k).apply {
            topKFrequentList.forEachIndexed { index, num ->
                this[index] = num
            }
        }
                                        
    }
}
