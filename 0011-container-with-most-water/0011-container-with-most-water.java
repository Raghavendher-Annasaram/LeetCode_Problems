class Solution {
    public int maxArea(int[] height) 
    {
        int left=0;
        int right=height.length-1;
        int water=0;
        while(left<right)
        {
            int a=Math.min(height[left],height[right]);
            int distance=right-left;
            int current=distance*a;
            if(current>water)
            {
                water=current;
            }
            if(height[left]>height[right])
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return water;
    }
}