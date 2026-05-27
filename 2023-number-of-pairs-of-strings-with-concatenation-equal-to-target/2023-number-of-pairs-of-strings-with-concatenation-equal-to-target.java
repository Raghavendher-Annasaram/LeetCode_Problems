class Solution {
    public int numOfPairs(String[] nums, String target) 
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            StringBuilder sb=new StringBuilder();
            sb.append(nums[i]);
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j)
                {
                sb.append(nums[j]);
                if(sb.toString().equals(target)) count++;
                sb.delete(nums[i].length(),sb.length());
                }
            }
            sb.delete(0,nums[i].length()-1);
        }
        return count; 
    }
}