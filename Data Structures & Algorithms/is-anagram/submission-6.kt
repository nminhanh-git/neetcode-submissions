class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false

        val charMapS = mutableMapOf<Char, Int>()
        val charMapT = mutableMapOf<Char, Int>()
        var result = true
        
        s.forEach { c ->
            charMapS[c] = (charMapS[c] ?: 0) + 1
        }
        t.forEach { c ->
            charMapT[c] = (charMapT[c] ?: 0) + 1
        }
        
        t.forEach { c ->
                // result = (charMapS[c] == charMapT[c]) && result
                if(charMapS[c] != charMapT[c]) return false
            }
        return result
    }
}
