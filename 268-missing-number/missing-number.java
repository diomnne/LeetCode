class Solution
{
    public int missingNumber(int[] nums)
    {
        int n = nums.length;

        int expectedSum = n * (n+1) / 2;
        int sumOfGiven = 0;

        for(int i=0; i<nums.length; i++)
        {
            sumOfGiven += nums[i];
        }
        return expectedSum - sumOfGiven;
    }
}