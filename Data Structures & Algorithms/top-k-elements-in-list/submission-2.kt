class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val count = mutableMapOf<Int, Int>()
        nums.forEach { num ->
            count[num] = count.getOrDefault(num, 0) + 1
        }

        val minHeap = PriorityQueue<Pair<Int, Int>> ( compareBy { it.second } )
        for((num, freq) in count) {
            minHeap.add(Pair(num, freq))
            if(minHeap.size > k) {
                minHeap.poll()
            }
        }

        val result = IntArray(k)
        for(i in k - 1 downTo 0) {
            result[i] = minHeap.poll().first
        }

        return result
    }
}
