class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ;i<nums.length; i++)
        {
            int count = 0;
            while(nums.length-1>i && nums[i]== nums[i+1])
            {
                count++;
                i++;
            }
            if(count==0)
            {
                return nums[i];
            }

        }
        return 0 ;
    }
}