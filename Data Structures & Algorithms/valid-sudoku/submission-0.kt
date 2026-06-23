class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {

        for(i in 0 until 9) {
            val mapRow = mutableMapOf<Char, Int>()
            for(j in 0 until 9) {
                if(board[i][j] == '.') continue
                if(mapRow[board[i][j]] != null) return false
                mapRow[board[i][j]] = 1
            }
        }

        for(j in 0 until 9) {
            val mapCol = mutableMapOf<Char, Int>()
            for(i in 0 until 9) {
                if(board[i][j] == '.') continue
                if(mapCol[board[i][j]] != null) return false
                mapCol[board[i][j]] = 1
            }
        }

        for(square in 0 until 9) {
            val mapSquare = mutableMapOf<Char, Int>()
            for(i in 0 until 3){
                val row = (square/3)*3 + i
                for(j in 0 until 3) {
                    val col = (square%3)*3 + j
                    if(board[row][col] == '.') continue
                    if(mapSquare[board[row][col]] != null) return false
                    mapSquare[board[row][col]] = 1
                }
            }
        }

        return true
    }
}
