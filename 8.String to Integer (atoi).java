class Solution {
    public int myAtoi(String s) {
        s=new String(s.trim());
        if(s.length()<1 || (s.length()==1 && (s.charAt(0)=='+' || s.charAt(0)=='-')) || (s.charAt(0)!='+' && s.charAt(0)!='-' && (s.charAt(0)<'0' || s.charAt(0)>'9')) || ((s.charAt(0)=='+' || s.charAt(0)=='-') && (s.charAt(1)=='+' || s.charAt(1)=='-') ))
            return 0;
        int sign=1,num=0,i=0;
        if(s.charAt(i)=='-')
        {
            sign=-1;
            i++;
        }
        else if(s.charAt(i)=='+')
            i++;
        while(i<s.length() && s.charAt(i)!=' ')
           {  
               if(s.charAt(i)<'0' || s.charAt(i)>'9')
                   break;
               if((num>(Integer.MAX_VALUE/10)) || ((num==(Integer.MAX_VALUE/10)) && (s.charAt(i)-'0')>7))
                return (sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE);
               num=num*10+(char)(s.charAt(i)-'0');
               i++;
           }
        return (num*sign);
    }
}
