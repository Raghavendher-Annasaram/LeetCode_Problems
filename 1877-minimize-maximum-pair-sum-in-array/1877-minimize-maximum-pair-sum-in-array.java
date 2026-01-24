class Solution {
    public int minPairSum(int[] nums) 
    {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        int j=nums.length-1;
        int i=0;
        while(i<=j)
        {
            list.add(nums[i]+nums[j]);
            i++;
            j--;
        }
        return Collections.max(list);
    }
}