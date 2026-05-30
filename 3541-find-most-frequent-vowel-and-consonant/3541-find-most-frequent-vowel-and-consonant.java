class Solution {
    public int maxFreqSum(String s) 
    {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int maxvowel=0;
        int maxconsonent=0;
        for(char c:map.keySet())
        {
            if(c=='a' || c=='e' || c=='i' || c=='o'||c=='u')
            {
                if(map.get(c)>maxvowel)
                {
                    maxvowel=map.get(c);
                }
            }
            else
            {
                if(map.get(c)>maxconsonent)
                {
                    maxconsonent=map.get(c);
                }
            }
        }
        return maxvowel+maxconsonent;
    }
}