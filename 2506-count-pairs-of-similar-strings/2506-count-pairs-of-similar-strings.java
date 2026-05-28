class Solution {
    public int similarPairs(String[] words) 
    {
        int count=0;
        for(int i=0;i<words.length-1;i++)
        {
            Set<Character> set1=new HashSet<>();
            for(int j=0;j<words[i].length();j++)
            {
                set1.add(words[i].charAt(j));
            }
            for(int j=i+1;j<words.length;j++)
            {
                Set<Character> set2=new HashSet<>();
                for(int k=0;k<words[j].length();k++)
                {
                    set2.add(words[j].charAt(k));
                }
                if(set2.equals(set1)) count++;
                set2.clear();
            }
            set1.clear();
        }
        return count;
    }
}