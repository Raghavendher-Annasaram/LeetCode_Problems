class Solution {
    public int numberOfSpecialChars(String word) 
    {
        Set<Character> set=new HashSet<>();
        for(int i=0;i<word.length();i++)
        {
            set.add(word.charAt(i));
        }
        int count=0;
        for(char c='a';c<='z';c++)
        {
            if(set.contains(c) && set.contains(Character.toUpperCase(c)))
            {
                count++;
            }
        }
        return count;    
    }
}