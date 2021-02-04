class Solution {
    public int strStr(String haystack, String needle) {
        if((haystack.length()==0 && needle.length()!=0) || (haystack.length()<needle.length()))
            return -1;
        if(needle.length()==0)
            return 0;
        int n=needle.length();
        int i=0,last=haystack.length()-n;
        while( i<last+1 && !(haystack.substring(i,i+n).equals(needle)))
            i++;
        if(i==last+1)
            return -1;
        return i;
    }
}
