class Solution {
    public int sumDivisibleByK(int[] nums, int k) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int sum=0;
        for(int key:map.keySet())
        {
            if(map.get(key)%k==0)
            {
                sum+=key*map.get(key);
            }
        }
        return sum;  
    }
}