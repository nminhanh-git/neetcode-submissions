class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        var product = 1
        var numberOfZero = 0
        nums.forEachIndexed { i, num ->
            if(num == 0) {
                numberOfZero++
            } else {
                product = product * num
            }
        }

        val result = IntArray(nums.size)

            nums.forEachIndexed { i, num ->
                   if(numberOfZero > 1) {
                    result[i] = 0
             } 
                else if(numberOfZero > 0) {
                    if(num == 0) {
                        result[i] = product
                    } else {
                        result[i] = 0
                    }
                } else {
                    result[i] = product/num
                }
            }
        
        return result
    }
   
}
