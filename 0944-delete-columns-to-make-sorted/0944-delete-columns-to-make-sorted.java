class Solution 
{
    public int minDeletionSize(String[] strs) 
    {
        if(strs.length==0)
            return 0;
        int c=0;
        for(int i=0;i<strs[0].length();i++)
        {
            int j=0;
            for(;j<strs.length-1;j++)
            {
                if(strs[j].charAt(i)>strs[j+1].charAt(i))
                    break;
            }
            if(j!=strs.length-1)
                c++;
        }
        return c;
    }
}