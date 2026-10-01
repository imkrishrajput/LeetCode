class Solution {
    public int compress(char[] chars) {
       String str;
         int count = 1;
        int j =0;
        for(int i = 0; i<chars.length;i++)
        {
            chars[j]=chars[i];
            j++;
            while((chars.length-1>i)&&(chars[i]== chars[i+1]) ) 
            {
                count++;
                i++;
            }
            if(count > 1)
            {
                str = Integer.toString(count);
                for( int k =0;k<str.length();k++)
                {
                    chars[j]=str.charAt(k);
                    j++;
                }
            }
            count = 1;
        }
        return j;
    }
}