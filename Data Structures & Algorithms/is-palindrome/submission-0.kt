class Solution {
    fun isPalindrome(s: String): Boolean {
        val regex = Regex("[^A-Za-z0-9]")
        val filteredStr = regex.replace(s, "").lowercase()
        var left = 0
        var right = filteredStr.length - 1

        while(left < right) {
            if(filteredStr[left] != filteredStr[right]) return false
            left++
            right--
        }
        return true
    }
}
