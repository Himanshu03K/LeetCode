class Solution {
    public List<String> generateParenthesis(int n) {
        
        
        List<String> ans  = new ArrayList<>();
        return Parentheses("",0,0,n,ans);
    }

    private static List<String> Parentheses(String str,int open,int clo,int n,List<String> list){
        if(open == n && clo == n){
            list.add(str);
            return list;
        }


        if(open<n)
            Parentheses(str+"(",open+1,clo,n ,list);

        if(clo<open)
        Parentheses(str+")",open,clo+1,n,list);
        return list;
    }
}