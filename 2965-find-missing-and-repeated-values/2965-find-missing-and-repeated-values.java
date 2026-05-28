class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
       int[] a=new int[2];
       for(int i=1;i<grid.length*grid.length+1;i++)
       {
        if(map.getOrDefault(i,0)==2)
        {
            a[0]=i;
        }
        if(map.getOrDefault(i,0)==0)
        {
            a[1]=i;
        }
       }
       return a;  
    }
}