class Solution {
    public String intToRoman(int num) {
        String[] units={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] tens={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hundreds={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] thousands={"","M","MM","MMM"};
        String str="";
        str=units[num%10];
        num/=10;
        if(num!=0)
        str=tens[num%10]+str;
        num/=10;
        if(num!=0)
        str=hundreds[num%10]+str;
        num/=10;
        if(num!=0)
            str=thousands[num%10]+str;
        return str;
    }
}
