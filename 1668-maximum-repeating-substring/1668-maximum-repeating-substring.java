class Solution {
    public int maxRepeating(String sequence, String word) 
    {
        int count=0;
        String s=word;
        StringBuilder sb=new StringBuilder();
        sb.append(word);
        while(s.length()<=sequence.length())
        {
            if(sequence.contains(s)) count++;
            sb.append(word);
            s=sb.toString();
        }
        return count; 
    }
}