class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        int[] a=new int[arr1.length];
        int i=0;
        for(int num:arr2)
        {
            int count=map.get(num);
            for(int j=count;j>0;j--)
            {
                a[i]=num;
                count--;
                i++;
            }
            map.remove(num);
        }
        List<Integer> list=new ArrayList<>();
        for(int key:map.keySet())
        {
            int freq=map.get(key);
            for(int j=0;j<freq;j++)
            {
                list.add(key);
            }
        }
        Collections.sort(list);
        for(int num:list)
        {
            a[i]=num;
            i++;
        }
        return a;
    }
}