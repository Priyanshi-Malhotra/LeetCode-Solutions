class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hash=new HashSet<Character>();
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            int count=1;
            hash.add(s.charAt(i));
            for(int j=i+1;j<s.length();j++)
            {
                if(hash.contains(s.charAt(j)))
                    break;
                count++;
                hash.add(s.charAt(j));
            }
            if(count>max)
                max=count;
            hash.clear();
        }
        return max;
    }
}
