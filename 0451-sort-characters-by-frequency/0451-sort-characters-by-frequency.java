class Solution {
    public String frequencySort(String s) 
    {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->
        {
            if(map.get(a)!=map.get(b))
            {
                return map.get(b)-map.get(a);
            }
            return 0;
        });
        pq.addAll(map.keySet());
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty())
        {
            char c=pq.poll();
            int freq=map.get(c);
            while(freq>0)
            {
                sb.append(c);
                freq--;
            }
        }
        return sb.toString();  
    }
}