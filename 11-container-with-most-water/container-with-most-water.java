class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxWater = 0;
        while(left<right)
        {
            int width = right-left;
            int tappedWater = width * Math.min(height[left], height[right]);
            if(height[right]<height[left])
            {
                right--;
            }
            else
            {
                left++;
            }
            maxWater = Math.max(tappedWater,maxWater);
        }
        return maxWater;
    }
}