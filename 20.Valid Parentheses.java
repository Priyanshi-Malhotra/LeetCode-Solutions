class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==')')
            {
                if(stack.isEmpty() || stack.peek()!='(')
                    return false;
                stack.pop();
            }
            else if(s.charAt(i)=='}')
            {
                if(stack.isEmpty() || stack.peek()!='{')
                    return false;
                stack.pop();
            }
            else if(s.charAt(i)==']')
            {
                if(stack.isEmpty() || stack.peek()!='[')
                    return false;
                stack.pop();
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }
        if(!(stack.isEmpty()))
            return false;
        return true;
    }
}
