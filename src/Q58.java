class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int a = s.lastIndexOf(' ');
        
        return (s.substring(a+1)).length();
    }
}
