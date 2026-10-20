class Solution {
    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long)Math.sqrt(c);
        while(left<=right)
        {
            long sum = right*right + left*left;
            if(sum==c)
            {
                return true;
            }
            else if(sum>c)
            {
                right--;
            }
            else
            {
                left--;
            }
        }
        return false;
    }
}