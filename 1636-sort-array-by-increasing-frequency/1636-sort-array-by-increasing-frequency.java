class Solution {
    public int[] frequencySort(int[] nums) 
    {
        Map<Integer,Integer> map=new  HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(
            (a,b)->{
                if(map.get(a)!=map.get(b))
                {
                    return map.get(a)-map.get(b);
                }
                return b-a;
            }
        );
        for(int num:nums)
        {
            pq.add(num);
        }
        int[] a=new int[nums.length];
        int j=0;
        while(!pq.isEmpty())
        {
            a[j]=pq.poll();
            j++;
        }
        return a;
    }
}