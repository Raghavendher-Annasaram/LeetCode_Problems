class Solution {
    public String customSortString(String order, String s) 
    {
        char[] c=new char[order.length()];
        for(int i=0;i<c.length;i++)
        {
            c[i]=order.charAt(i);
        }
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
           map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<c.length;i++)
        {
            if(map.containsKey(c[i]))
            {
                int freq=map.get(c[i]);
               while(freq>0)
               {
                sb.append(c[i]);
                map.remove(c[i]);
                freq--;
               }
            }
        }
        for(char key:map.keySet())
        {
            int count=map.get(key);
            while(count>0)
            {
                sb.append(key);
                count--;
            }
        }
        return sb.toString();
    }
}