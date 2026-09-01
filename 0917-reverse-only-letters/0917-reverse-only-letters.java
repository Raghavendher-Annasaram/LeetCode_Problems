class Solution {
    public String reverseOnlyLetters(String s) 
    {
     StringBuilder sb=new StringBuilder();
     for(int i=s.length()-1;i>=0;i--){
        if((s.charAt(i)>='a' && s.charAt(i)<='z' ) || (s.charAt(i)>='A' && s.charAt(i)<='Z')){
            sb.append(s.charAt(i));
        }
     }
     StringBuilder sb1=new StringBuilder();
     int i=0;
     int j=0;
     while(i<s.length()){
        if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')){
            sb1.append(sb.charAt(j));
            j++;
        }
        else{
            sb1.append(s.charAt(i));
        }
        i++;
     }
     return sb1.toString(); 
    }
}