class Solution {
    public int maxFrequencyElements(int[] nums) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        for(int num: map.values())
        {
            if(num>max)
            {
                max=num;
            }
        }
        int count=0;
        for(int freq:map.values())
        {
            if(freq==max)
            {
                count+=freq;
            }
        }
        return count;   
    }
}