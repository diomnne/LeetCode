class Solution
{
    public String addBinary(String a, String b)
    {
        int maxLength = Math.max(a.length(), b.length()) + 1;
        int i = a.length()-1;
        int j = b.length()-1;
        int k = maxLength-1;
        char[] result = new char[maxLength];
        int carry = 0;

        while(i >= 0 || j>= 0 || carry == 1)
        {
            int sum = carry;

            if(i >= 0)
            {
                sum += (a.charAt(i) - '0');
                i--;
            }
            if(j >= 0)
            {
                sum += (b.charAt(j) - '0');
                j--; 
            }

            result[k--] = (char)((sum % 2) + '0');
            carry = sum / 2;
        }
        return new String(result, k+1, maxLength-k-1);
    }
}