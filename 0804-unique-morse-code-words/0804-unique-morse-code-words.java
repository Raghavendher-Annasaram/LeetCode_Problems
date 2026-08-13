class Solution {
    public int uniqueMorseRepresentations(String[] words) 
    {
            String[] a={
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
            };
            Set<String> set=new HashSet<>();
            for(String s:words){
                StringBuilder sb=new StringBuilder();
                for(char c:s.toCharArray())
                {
                    sb.append(a[c-'a']);
                }
                set.add(sb.toString());
            }
            return set.size();
    }
}