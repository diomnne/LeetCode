class Solution
{
    public int searchInsert(int[] nums, int target)
    {
        int start = 0, end = nums.length-1;

        while(start <= end)
        {
            int middle = (start+end)/2;

            if(nums[middle] == target)
            {
                return middle;
            }    
            else if(nums[middle] > target)
            {
                end = middle-1;
            }        
            else if(nums[middle] < target)
            {
                start = middle+1;
            }
        }
        return start;
    }
}