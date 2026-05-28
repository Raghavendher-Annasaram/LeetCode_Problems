class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) 
    {
        List<List<Integer>> list=new ArrayList<>();
        Map<Integer,Integer> map1=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++)
        {
            map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
        }
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>(); 
        for(int key:map1.keySet())
        {
            if(map2.getOrDefault(key,0)==0)
            {
                list1.add(key);
            }
        }
        for(int key:map2.keySet())
        {
            if(map1.getOrDefault(key,0)==0)
            {
                list2.add(key);
            }
        }
        list.add(list1);
        list.add(list2);
        return list; 
    }
}