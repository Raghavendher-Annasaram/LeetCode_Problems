class Solution {
    public String reverseVowels(String s) 
    {
        char[] a=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            while(left<right && !isvowel(a[left]))
            {
                left++;
            }
            while(right>left && !isvowel(a[right]))
            {
                right--;
            }
            char temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        return new String(a);   
    }
    public boolean isvowel(char c)
    {
        if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
            return true;
        }
        return false;
    }
}