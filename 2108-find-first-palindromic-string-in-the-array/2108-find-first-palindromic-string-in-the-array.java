class Solution {
    
    private boolean check(String s){
        
        int beg=0,end=s.length()-1;
        while(beg<end){
            if(s.charAt(beg)!=s.charAt(end))
                return false;
            
            beg++;
            end--;
        }
        
        return true;
    }
    public String firstPalindrome(String[] words) {
        String ans="";
        for(int i=0;i<words.length;i++){
            if(check(words[i]))
            {
                ans=words[i];
                break;
            }
        }
        return ans;
    }
}