class Solution {
    fun maxProfit(prices: IntArray): Int {
        var max = 0
        for(i in prices.indices) {
            for (j in (i+1) until prices.size) {
                val current = prices[j] - prices[i]
                println("buy: ${prices[i]}, sell: ${prices[j]} = $current")
                if(max < current) max = current
            }
        }
        return max
    }
}
