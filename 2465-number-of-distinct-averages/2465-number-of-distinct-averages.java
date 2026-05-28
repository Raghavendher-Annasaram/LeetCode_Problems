class Solution {
    public int distinctAverages(int[] nums) 
    {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
        }
        Set<Double> set=new HashSet<>();
        while(list.size()>0)
        {
            set.add((Collections.max(list)+Collections.min(list))/2.0);
            list.remove(Integer.valueOf(Collections.max(list)));
            list.remove(Integer.valueOf(Collections.min(list)));
        }
        return set.size(); 
    }
}