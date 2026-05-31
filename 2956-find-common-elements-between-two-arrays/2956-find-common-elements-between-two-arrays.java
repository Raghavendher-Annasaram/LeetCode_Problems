class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) 
    {
       Set<Integer> set1=new HashSet<>();
       for(int i=0;i<nums1.length;i++)
       {
        set1.add(nums1[i]);
       }
       int answer1=0;
        for(int i:nums2)
        {
            if(set1.contains(i))
            {
                answer1++;
            }
        }
        set1.clear();
        int answer2=0;
        for(int i=0;i<nums2.length;i++)
        {
            set1.add(nums2[i]);
        }
        for(int i:nums1)
        {
            if(set1.contains(i))
            {
                answer2++;
            }
        }
        int[] a=new int[2];
        a[0]=answer2;
        a[1]=answer1;
        return a;
    }
}