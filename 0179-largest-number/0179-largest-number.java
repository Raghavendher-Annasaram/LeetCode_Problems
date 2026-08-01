class Solution {
    public String largestNumber(int[] nums) 
    {
        Integer[] arr=new Integer[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
        StringBuilder sb=new StringBuilder();
        Arrays.sort(arr,(a,b)->
        {
        String s1=a+""+b;
        String s2=b+""+a;
        return s2.compareTo(s1);
        });
        if(arr[0]==0)
        {
            return "0";
        }
        for(int k=0;k<arr.length;k++)
        {
            sb.append(arr[k]);
        }
        return sb.toString();  
    }
}