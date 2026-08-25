class Solution {
    public int missingMultiple(int[] nums, int k) 
    {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int res=0;
        int i=1;
        while(res==0){
            if(!set.contains(i*k)){
                res=i*k;
            }
            else{
                i++;
            }
        }
        return res;
    }
}