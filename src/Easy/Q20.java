package Easy;

class Solution {
    public boolean isValid(String s) {
       int len;
    
        do {
            len = s.length();
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        } while(len!= s.length());
    
        return s.length() == 0;
    }
}
