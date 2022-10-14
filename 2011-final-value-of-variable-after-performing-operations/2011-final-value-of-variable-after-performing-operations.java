class Solution {
    
    int oper(String s){
        for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='+')
                    return 1;
        }
        return -1;
    }
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(String s : operations){
            ans+=oper(s);
        }
        return ans;
    }
}