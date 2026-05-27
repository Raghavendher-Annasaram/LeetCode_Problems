class Solution {
    public int countCharacters(String[] words, String chars) 
    {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<chars.length();i++)
        {
            map.put(chars.charAt(i),map.getOrDefault(chars.charAt(i),0)+1);
        }
        int sum=0;
        for(String word:words)
        {
            Map<Character,Integer> map1=new HashMap<>();
            for(int i=0;i<word.length();i++)
            {
                map1.put(word.charAt(i),map1.getOrDefault(word.charAt(i),0)+1);
            }
            boolean a=true;
            for(char d:map1.keySet())
            {
                if(map1.get(d)>map.getOrDefault(d,0))
                {
                    a=false;
                    break;
                }
            }
            if(a)
            {
                sum+=word.length();
            }
        }
        return sum;
    }
}