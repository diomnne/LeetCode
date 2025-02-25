class Solution
{
    public int maxProfit(int[] prices)
    {
        int minPrice = Integer.MAX_VALUE, maxProfit = 0;
        

        for(int i: prices)
        {
            minPrice = Math.min(minPrice, i);
            maxProfit = Math.max(maxProfit, i-minPrice);
        }

        return maxProfit;
    }
}