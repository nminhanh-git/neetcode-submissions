class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var start = 0
        var end = 0
        var maxLength = 0
        val countMap = mutableMapOf<Char, Int>()
        while(start < s.length && end < s.length) {
            println("now start is $start, end is $end")
            if(end + 1 > s.length) break 
            if(countMap[s[end]] != null) {
                println("substring does contain ${s[end]}")
                countMap.remove(s[start])
                start++
            } else {
                println("substring does not contain ${s[end]}")
                countMap[s[end]] = countMap.getOrDefault(s[end], 1)
                maxLength = max(maxLength, end - start + 1)
                end++
            }
        }
        return maxLength
    }
}
