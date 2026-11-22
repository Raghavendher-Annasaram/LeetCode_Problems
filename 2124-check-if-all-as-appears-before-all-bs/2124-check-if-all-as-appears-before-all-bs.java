class Solution {
    public boolean checkString(String s) 
    {
        int a=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b')
            {
                a=i;
                break;
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                if(i>a && a!=-1)
                {
                    return false;
                }
            }
        }

       return true;
        
    }
}