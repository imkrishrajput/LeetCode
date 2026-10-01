class Solution {
    public String longestCommonPrefix(String[] strs) {
       if(strs==null || strs.length == 0)
        {
            return "";
        }
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int x = 0;
        while(x<first.length() && x<last.length() && first.charAt(x) == last.charAt(x))
            {
                x++;
            }
        return first.substring(0, x);
    }
}