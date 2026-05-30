class Solution {
    public int maxDifference(String s) 
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int mineven=Integer.MAX_VALUE;
        int minodd=0;
        int maxodd=0;
        for(int value:map.values())
        {
            if(value%2==0)
            {
                if(value<mineven)
                {
                    mineven=value;
                }
               
            }
            if(value%2!=0)
            {
                
                if(value>maxodd)
                {
                    maxodd=value;
                }
            }
        }
        return maxodd-mineven;   
    }
}