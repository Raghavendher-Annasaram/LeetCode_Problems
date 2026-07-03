class Solution {
    public String addBinary(String a, String b) 
    {
        int c=a.length()-1;
        int d=b.length()-1;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        while(c>=0||d>=0||carry!=0)
        {
            int sum=carry;
            if(c>=0)
            {
                sum+=a.charAt(c)-'0';
                c--;
            }
            if(d>=0)
            {
                sum+=b.charAt(d)-'0';
                d--;
            }
            sb.append(sum%2);
            carry=sum/2;
        }
        return sb.reverse().toString();   
    }
}