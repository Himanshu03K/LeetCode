import java.util.*;
class Solution {
    public String sortSentence(String s) {
        StringBuilder ans = new StringBuilder();
        StringTokenizer st= new StringTokenizer(s);
        int c=st.countTokens();
        String arr[]=new String[c];
        while(st.hasMoreTokens()){
            String s1=st.nextToken();
            int index=(int) (s1.charAt(s1.length() - 1) - '0');
            arr[index-1] = s1.substring(0,s1.length()-1);
        }
        
        for(int i=0;i<arr.length;i++){
            ans.append(arr[i]+" ");
        }
        return ans.toString().trim();
    }
}