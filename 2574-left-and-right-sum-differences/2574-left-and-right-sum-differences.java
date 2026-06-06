class Solution {
    public int[] leftRightDifference(int[] nums) 
    {
        int sum=0;
        int leftsum=0;
        int[] a=new int[nums.length];
        int b=0;
        for(int i=0;i<nums.length;i++)
        {
            int rightsum=0;
            int j=nums.length-1;
            if(i!=0) leftsum+=nums[i-1];
            while(j>i)
            {
                rightsum+=nums[j];
                j--;
            }
            a[b]=Math.abs(leftsum-rightsum);
            b++;
        }
        return a;
    }
}