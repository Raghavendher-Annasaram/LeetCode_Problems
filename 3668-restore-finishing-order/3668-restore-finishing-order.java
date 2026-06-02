class Solution {
    public int[] recoverOrder(int[] order, int[] friends) 
    {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<friends.length;i++)
        {
            set.add(friends[i]);
        }
        int[] a=new int[friends.length];
        int i=0;
        for(int n:order)
        {
            if(set.contains(n))
            {
                a[i]=n;
                i++;
            }
        }
        return a;
    }
}