class Solution {
    public int countCompleteSubarrays(int[] nums) 
    {
        Set<Integer>  set=new HashSet<>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            Set<Integer> s=new HashSet<>();
            for(int j=i;j<nums.length;j++)
            {
                s.add(nums[j]);
                if(set.size()==s.size())
                {
                count++;
                }
            }
        }
        return count;
    }
}