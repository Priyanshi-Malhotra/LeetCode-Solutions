class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int num=x,a=0;
        while(num!=0)
        {
            a=a*10+(num%10);
            num/=10;
        }
        return a==x;
    }
}
