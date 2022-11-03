class Solution {
    public char repeatedCharacter(String s) {
        char ans='a';
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                ans =c;
                break;
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        return ans;
    }
}