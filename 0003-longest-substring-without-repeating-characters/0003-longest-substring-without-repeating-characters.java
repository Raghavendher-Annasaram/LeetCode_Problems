class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int max=0;
        for(int i=0;i<s.length();i++){
            Set<Character> set=new HashSet<>();
            int j=i;
            while(j<s.length() && !set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
            }
            max=Math.max(max,j-i);
        }
        return max;
            
    }
}