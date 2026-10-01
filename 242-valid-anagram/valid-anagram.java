class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        s = Arrays.toString(char1);
        t = Arrays.toString(char2);
        for(int i = 0; i<s.length()-1; i++)
        {
            if(s.charAt(i)!=t.charAt(i))
            {
                return false;
            }   
           
        }
        return true;
    }
}
