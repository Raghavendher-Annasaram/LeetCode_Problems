class Solution {
    public List<String> topKFrequent(String[] words, int k) 
    {
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<String> pq=new PriorityQueue<>(
            (a,b)->
            {
                if(map.get(a)!=map.get(b))
                {
                    return map.get(b)-map.get(a);
                }
                return a.compareTo(b);
            }
        );
        pq.addAll(map.keySet());
        List<String> list=new ArrayList<>();
        while(k>0)
        {
            list.add(pq.poll());
            k--;
        }
        return list;
    }
}