class Solution {
    public int[] arrayRankTransform(int[] arr) 
    {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]);
        }
        Collections.sort(list);
        Map<Integer,Integer> map=new HashMap<>();
        int i=1;
        for(int num:list)
        {
            if(!map.containsKey(num))
            {
                map.put(num,i);
                i++;
            }
        }
        int[] a=new int[arr.length];
        for(int j=0;j<arr.length;j++)
        {
            a[j]=map.get(arr[j]);
        }
        return a;
    }
}