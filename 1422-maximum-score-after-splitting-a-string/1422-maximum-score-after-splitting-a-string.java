class Solution {
    public int maxScore(String s) 
    {
        int max=0;
        int zeros=0;
        for(int i=0;i<s.length()-1;i++)
        {
            int ones=0;
            int right=s.length()-1;
            if(s.charAt(i)=='0') zeros++;
            while(right>i)
            {
                if(s.charAt(right)=='1')
                {
                    ones++;
                }
                right--;
            }
            if(max<(ones+zeros))
            {
                max=ones+zeros;
            }
        }
        return max;   
    }
}