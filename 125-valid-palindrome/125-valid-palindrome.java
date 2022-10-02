class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        
        while (left < right){
            char ch1 = s.charAt(left);
            char ch2 = s.charAt(right);
            
            //if ch1 is not valid then move forward
            if (!Character.isLetterOrDigit(ch1)) left++;
            // if ch2 is not valid move backward
            else if (!Character.isLetterOrDigit(ch2)) right--;
            // otherwise compare
            else{
                if (Character.toLowerCase(ch1) != Character.toLowerCase(ch2)) return false;    
                left++;
                right--;    
            }
        }
        
        return true;
    }
}