class Solution {
    public boolean isPossibleToSplit(int[] nums) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        boolean r=true;
        for(int value:map.values())
        {
            if(value>2)
            {
                r=false;
                break;
            }
        }
        return r;   
    }
}