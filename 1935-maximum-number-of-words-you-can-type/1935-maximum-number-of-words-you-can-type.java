class Solution {
    public int canBeTypedWords(String text, String brokenLetters) 
    {
        String[] a=text.split(" ");
        Set<Character> set=new HashSet<>();
        for(int i=0;i<brokenLetters.length();i++)
        {
            set.add(brokenLetters.charAt(i));
        }
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            boolean b=true;
            for(int j=0;j<a[i].length();j++)
            {
                if(set.contains(a[i].charAt(j)))
                {
                    b=false;
                    break;
                }
            }
            if(b)
            {
                count++;
            }
        }
        return count;
    }
}