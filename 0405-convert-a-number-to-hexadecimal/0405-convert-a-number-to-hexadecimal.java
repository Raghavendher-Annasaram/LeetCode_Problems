class Solution {
    public String toHex(int num) 
    {
       String s="0123456789abcdef";
       StringBuilder sb=new StringBuilder();
       if(num==0){
        return "0";
       }
       while(num!=0){
        int  c= num & 15;
        sb.append(s.charAt(c));
        num=num>>>4;
       }
       return sb.reverse().toString();
    }
}