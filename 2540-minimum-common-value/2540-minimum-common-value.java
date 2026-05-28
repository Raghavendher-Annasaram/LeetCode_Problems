class Solution {
    public int getCommon(int[] nums1, int[] nums2) 
    {
        List<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int i:nums1)
        {
            set.add(i);
        }
        for(int i:nums2)
        {
            if(set.contains(i))
            {
                list.add(i);
            }
        }
        if(list.size()>0)
        {
            return Collections.min(list);
        }
        return -1;  
    }
}