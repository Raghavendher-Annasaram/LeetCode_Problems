class Solution {
    public int missingMultiple(int[] nums, int k) 
    {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int r=0;
        for(int i=1;i<=nums.length+1;i++)
        {
            if(!set.contains(k*i))
            {
                r=k*i;
                break;
            }
        }
        return r;   
    }
}