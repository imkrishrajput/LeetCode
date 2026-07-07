class Solution {
    public int majorityElement(int[] nums) {
       Arrays.sort(nums);
        // int j = nums[0];
        int count = 0;
        int maxCount = 0;
        for( int i=1; i<nums.length; i++)
        {
            if(nums[i] == nums[i-1])
            {
                count++;
            }
            else
            {
                // j=i;                
                count = 0;
            }
            maxCount = Math.max(maxCount , count);
        }
        return nums[maxCount];
    }
}