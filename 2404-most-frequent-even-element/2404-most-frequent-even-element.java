class Solution {
    public int mostFrequentEven(int[] nums) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        if(map.size()==0) 
        {
            return -1;
        }
        Integer[] ab=new Integer[map.size()];
        int v=0;
        for(int i:map.keySet())
        {
            ab[v]=i;
            v++;
        }
        Arrays.sort(ab,(a,b)->
        {
            if(map.get(a)!=map.get(b))
            {
                return map.get(b)-map.get(a);
            }
            return a-b;
        });
        return ab[0];
    }
}