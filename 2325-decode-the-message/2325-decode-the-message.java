class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        int j = 0;
        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            if (ch == ' ') 
                continue;
            if(!map.containsKey(ch)) 
                map.put(ch, (char)('a' + j++));
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (ch == ' ') {
                str.append(' '); 
                continue;
            }
            str.append(map.get(ch));
        }
        return str.toString();
    }
}