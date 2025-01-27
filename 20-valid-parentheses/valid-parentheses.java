class Solution
{
    public boolean isValid(String s)
    {
        Stack<Character> p = new Stack();

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            {
                p.push(s.charAt(i));
            }
            else
            {
                if(!p.empty() && ((p.peek() == '(' && s.charAt(i) == ')') || (p.peek() == '{' && s.charAt(i) == '}') || (p.peek() == '[' && s.charAt(i) == ']')))
                {
                    p.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        return p.empty();
    }
}