class Solution {
    public String addStrings(String num1, String num2) 
    {
        StringBuilder sb=new StringBuilder();
        int len1=num1.length()-1;
        int len2=num2.length()-1;
        int carry=0;
        while(len1>=0 && len2>=0)
        {
            int sum=(num1.charAt(len1)-'0')+(num2.charAt(len2)-'0')+carry;
            len1--;
            len2--;
            sb.append(sum%10);
            carry=sum/10;
        }
        while(len1>=0){
            int sum=carry+(num1.charAt(len1)-'0');
            sb.append(sum%10);
            carry=sum/10;
            len1--;
        }
        while(len2>=0){
            int sum=carry+(num2.charAt(len2)-'0');
            sb.append(sum%10);
            carry=sum/10;
            len2--;
        }
        if(carry>0){
        sb.append(carry);
        }
        return sb.reverse().toString();
    }
}