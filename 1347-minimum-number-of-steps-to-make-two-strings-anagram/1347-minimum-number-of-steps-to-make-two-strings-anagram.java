class Solution {
    public int minSteps(String s, String t) 
    {
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }
        int sum=0;
        for(char key:map2.keySet())
        {
            int f1=map1.getOrDefault(key,0);
            int f2=map2.get(key);
            if(f2>f1)
            {
                sum+=f2-f1;
            }
        }
        return sum;
    }
}