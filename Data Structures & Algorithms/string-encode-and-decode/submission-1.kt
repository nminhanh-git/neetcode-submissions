class Solution {

    fun encode(strs: List<String>): String {
        var encoded = ""
        strs.forEach { str ->
            encoded = encoded + "${str.length}#$str"
        }
        return encoded
    }

    fun decode(str: String): List<String> {
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
