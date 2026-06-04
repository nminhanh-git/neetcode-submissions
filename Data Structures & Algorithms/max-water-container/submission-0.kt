class Solution {
    fun maxArea(heights: IntArray): Int {
        var left = 0
        var right = heights.size - 1
        var result = 0
        while(left <= right) {
            val temp = (right - left) * min(heights[left], heights[right])
            if(result < temp) result = temp
            if(heights[left] < heights[right]) {
                left++
            } else {
                right--
            }
        }
        return result
    }
}
