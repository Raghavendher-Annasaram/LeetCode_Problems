class Solution {
    public String mostCommonWord(String paragraph, String[] banned) 
    {
        paragraph=paragraph.toLowerCase();
        paragraph=paragraph.replaceAll("[^a-z]"," ");
        String[] words=paragraph.split(" ");
        Set<String> set=new HashSet<>();
        for(int i=0;i<banned.length;i++)
        {
            set.add(banned[i]);
        }
        HashMap<String,Integer> map=new HashMap<>();
        for(String word:words)
        {
            if(!set.contains(word) &&  !word.equals(""))
            {
                map.put(word,map.getOrDefault(word,0)+1);
            }
        }
        String r="";
        int max=0;
        for(String key:map.keySet())
        {
            if(map.get(key)>max && !set.contains(key))
            {
                r=key;
                max=map.get(key);
            }
        }
        return r;
    }
}