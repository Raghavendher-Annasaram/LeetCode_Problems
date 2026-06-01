class Solution {
    public int countBalls(int lowLimit, int highLimit) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=lowLimit;i<=highLimit;i++)
        {
            if(i<10)
            {
                map.put(i,map.getOrDefault(i,0)+1);
            }
            else
            {
                int sum=0;
                int num=i;
                while(num>0)
                {
                    sum+=num%10;
                    num/=10;
                }
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        int result=0;
        for(int value:map.values())
        {
            if(result<value)
            {
                result=value;
            }
        }
        return result;
    }
}