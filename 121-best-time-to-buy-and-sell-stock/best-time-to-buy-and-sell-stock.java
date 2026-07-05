class Solution {
    public int maxProfit(int[] nums) {
               int maxPro = 0;
       int buyPrice= Integer.MAX_VALUE;
        for(int i= 0;i<nums.length;i++)
        {
            buyPrice = Math.min(buyPrice,nums[i]);
            maxPro = Math.max(maxPro,(nums[i]-buyPrice));
        }
        return maxPro;
    }
}