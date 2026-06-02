class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val mapOfGroup = mutableMapOf<String, MutableList<String>>()
        strs.forEach { s ->
            mapOfGroup.keys.firstOrNull { key -> isAnagram(s, key) }?.let { key ->
                mapOfGroup[key]?.add(s)
            } ?: run { mapOfGroup[s] = mutableListOf(s) }
        }
        return mapOfGroup.values.map {it.toList()}.toList()
    }

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
                if(charMapS[c] != charMapT[c]) return false
            }
        return result
    }
}
