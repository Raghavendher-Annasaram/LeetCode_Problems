class Solution {
    public int[] applyOperations(int[] nums) 
    {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int[] r=new int[nums.length];
        int b=nums.length-1;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                r[c]=nums[i];
                c++;
            }
            else
            {
                r[b]=nums[i];
                b--;
            }
        }
        return r;  
    }
}