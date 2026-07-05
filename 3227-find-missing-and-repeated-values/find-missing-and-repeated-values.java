class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int missing = 0;
        int repeated =0;
        int[] key = new int [grid.length*grid.length +1];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length; j++)
            {
                key[grid[i][j]]++;
            }
        }
            for(int i = 1; i < key.length; i++) 
            {

                if(key[i] == 2)
                {
                    repeated = i;
                }
                if(key[i] == 0)
                {
                    missing = i;
                }       
            }
            return new int[]{repeated , missing};
    }
}