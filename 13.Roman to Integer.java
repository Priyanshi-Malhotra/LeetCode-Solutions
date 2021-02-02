class Solution {
    public int val(char s)
    {
        switch(s)
        {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
        int num=0,i=0;
        while(i<(s.length()-1))
        {
            if(val(s.charAt(i))>=val(s.charAt(i+1)))
                num+=val(s.charAt(i));
            else
                num-=val(s.charAt(i));
            i++;
        }
        num+=val(s.charAt(i));
        return num;
    }
}
