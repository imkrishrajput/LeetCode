class Solution {
    public int majorityElement(int[] nums) {
       Arrays.sort(nums);
        // int j = nums[0];
        int count = 1;
        int maxCount = 1;
        int majority = nums[0];
        for( int i=1; i<nums.length; i++)
        {
            if(nums[i] == nums[i-1])
            {
                count++;
            }
            else
            {
                // j=i;                
                count = 1;
            }
            if(count>maxCount)
            {
                maxCount = count;
                majority = nums[i];
            }
        }
        return majority;
    }
}