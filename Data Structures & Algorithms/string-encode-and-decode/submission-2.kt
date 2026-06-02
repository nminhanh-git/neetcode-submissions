class Solution {

    fun encode(strs: List<String>): String {
        var encoded = ""
        if(strs.isEmpty()) return encoded
        strs.forEach { str ->
            encoded = encoded + "${str.length}#$str"
        }
        return encoded
    }

    fun decode(str: String): List<String> {
        if(str.isEmpty()) return listOf<String>()
        val result = mutableListOf<String>()
        var pointer = 0
        while (pointer < str.length) {
            val delimiterIndex = str.indexOf('#', pointer)
            val length = str.substring(pointer, delimiterIndex).toInt()
            val subStr = str.substring(delimiterIndex + 1, delimiterIndex + 1 + length)
            result.add(subStr)
            pointer = delimiterIndex + 1 + length
        }
        return result
    }
}
