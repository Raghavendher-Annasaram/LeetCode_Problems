class Solution {
    public int maxProduct(String[] words) 
    {
        int res=0;
        for(int i=0;i<words.length-1;i++){
            Set<Character> set=new HashSet<>();
            for(char c:words[i].toCharArray()){
                set.add(c);
            }
            for(int j=i+1;j<words.length;j++){
                int current=0;
               int l=words[j].length()-1;
                while(l>=0){
                    if(set.contains(words[j].charAt(l))){
                        break;
                    }
                    l--;
                }
                if(l==-1){
                    current=words[j].length()*words[i].length();
                }
                res=Math.max(res,current);
            }
        }
        return res;
    }
}