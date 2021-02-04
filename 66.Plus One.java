class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        for(int i=digits.length-1;i>=0;i--)
        {
            digits[i]+=carry;
            if(i==digits.length-1)
                digits[i]+=1;
            if(digits[i]>9)
            {
                digits[i]%=10;
                carry=1;
            }
            else
                carry=0;
        }
        if(carry==1)
        {
            int[] new_array=new int[digits.length+1];
            new_array[0]=1;
            for(int i=0;i<digits.length;i++)
                new_array[i+1]=digits[i];
            return new_array;
        }
        return digits;
    }
}
