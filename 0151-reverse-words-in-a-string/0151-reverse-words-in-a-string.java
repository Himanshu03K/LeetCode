import java.util.*;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder temp = new StringBuilder();
        while(st.hasMoreTokens()){
            temp.insert(0,st.nextToken());
            temp.insert(0," ");

        }
        // temp.reverse();
        return temp.toString().trim();
            
    }
}