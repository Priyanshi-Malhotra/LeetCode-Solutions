class Solution {
    String strr="";
    public String countAndSay(int n)
    {
        count_and_say("1",n);
        return strr;
    }
    public void count_and_say(String s,int n)
    {
        if(n==1)
        {
            strr=new String(s);
            return;
        }
        int count=0,i=0;
        String str="";
        char a=s.charAt(0);
        while(i<s.length()+1)
        {
            if(i!=s.length() && s.charAt(i)==a)
                count++;
            else
            {
                str+=count;
                str+=a;
                count=1;
                if(i!=s.length())
                a=s.charAt(i);
            }
            i++;
        }
        count_and_say(str,n-1);
        return;
    }
}
