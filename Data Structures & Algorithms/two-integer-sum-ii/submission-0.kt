class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size - 1
        
        while(left < right) {
            if((target - numbers[left]) == numbers[right]) {
                return intArrayOf(left+1, right+1)
            }
            if((target - numbers[left]) > numbers[right]) {
                left++
            } else {
                right--
            }
        }
        return intArrayOf()
    }
}
