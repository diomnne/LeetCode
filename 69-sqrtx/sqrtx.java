class Solution
{
    public int mySqrt(int x)
    {
        int start = 1, end = x, ans = 0; 
        
        if(x == 0  || x == 1)
        {
            return x;
        }

        while(start <=  end)
        {
            int mid = start + (end - start) / 2;

            if(mid <= x/mid)
            {
                start = mid + 1;
                ans = mid;
            }
            else
            {
                end = mid - 1;
            }
        }

        return ans;
    }
}