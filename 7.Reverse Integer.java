class Solution {
    public int reverse(int num) {
        int temp=1,a=0;
        while(num!=0)
        {
            temp=(num%10);
            num/=10;
            if(a>Integer.MAX_VALUE/10 || (a==Integer.MAX_VALUE/10 && temp>7))
                return 0;
            if(a<Integer.MIN_VALUE/10 || (a==Integer.MIN_VALUE/10 && temp<-8))
                return 0;
            a=(a*10)+temp;
        }
        return a;
    }
}
