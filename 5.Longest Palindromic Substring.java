class Solution {
    public boolean check_palindrome(String s,int ii,int jj)
    {
        int i=ii,j=jj;
        while(i<=jj && j>=ii && s.charAt(i)==s.charAt(j))
        {
            i++;
            j--;
        }
        if(i<=jj && j>=ii && s.charAt(i)!=s.charAt(j))
            return false;
        return true;
    }
    public String longestPalindrome(String s) {
        int ii=0,jj=0,max=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=s.length()-1;j>i;j--)
            {
                if(s.charAt(i)==s.charAt(j) && check_palindrome(s,i,j))
                {
                    if(i==0 && j==s.length()-1)
                        return s;
                    if((j-i+1)>max)
                    {
                        max=(j-i+1);
                        ii=i;
                        jj=j;
                    }
                }
            }
        }
        return s.substring(ii,jj+1);
    }
}
