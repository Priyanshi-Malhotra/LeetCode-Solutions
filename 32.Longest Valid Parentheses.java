class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        int i=0,longest=0,length=0;
        stack.push(-1);
        while(i<s.length())
        {
            if(s.charAt(i)==')')
            {
                stack.pop();
                if(stack.isEmpty())
                    stack.push(i);
                else
                {
                 length=i-stack.peek();
                    if(length>longest)
                        longest=length;
                }
            }
            else
                stack.push(i);
            i++;
        }
        return longest;
    }
}
