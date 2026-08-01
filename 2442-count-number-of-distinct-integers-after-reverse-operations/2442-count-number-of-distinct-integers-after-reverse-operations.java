class Solution {
    public int countDistinctIntegers(int[] nums) 
    {
            Set<Integer> set=new HashSet<>();
            for(int i=0;i<nums.length;i++)
            {
                set.add(nums[i]);
            }
            int k=0;
            while(k<nums.length)
            {
                int temp=0;
                int current=nums[k];
                String s=Integer.toString(current);
                int j=s.length()-1;
                while(current>0)
                {
                    temp+=current%10*Math.pow(10,j);
                    j--;
                    current/=10;
                }
                set.add(temp);
                k++;
            }
            return set.size();
    }
}