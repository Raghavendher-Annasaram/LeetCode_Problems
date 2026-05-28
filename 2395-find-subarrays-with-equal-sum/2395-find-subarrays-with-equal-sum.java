class Solution {
    public boolean findSubarrays(int[] nums) 
    {
        boolean r=false;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length-1;i++)
        {
            int sum=nums[i]+nums[i+1];
            if(set.contains(sum))
            {
                r=true;
            }
            set.add(sum);
        }
        return r;
    }
}