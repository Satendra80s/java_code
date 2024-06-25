class Solution {
    public boolean isSubsequence(String s, String t) {
    if(s.length()==null)
    return true;
int i=0,j=0;
while(i<s.length() && j<t.length())
{
	if(s.charAt(i)==t.charAt(j))
	{
		i++;

	}
	j++;
}

return i==s.length();

    }
    public static void main (String[]args)
    {
    	String a="abc";
    	String b="asbsce";
    	System.out.println(a,b);

    } 
    }