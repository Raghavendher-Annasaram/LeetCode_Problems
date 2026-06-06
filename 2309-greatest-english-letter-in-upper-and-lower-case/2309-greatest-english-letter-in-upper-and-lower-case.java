class Solution {
    public String greatestLetter(String s) 
    {
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        }
        for(char i='z';i>='a';i--)
        {
            if(set.contains(Character.toLowerCase(i)) && set.contains(Character.toUpperCase(i)))
            {
                return Character.toString((Character.toUpperCase(i)));
            }
        }
        return "";
    }
}