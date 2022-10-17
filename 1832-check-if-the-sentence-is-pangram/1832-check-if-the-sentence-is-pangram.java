class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()>=26){
            int arr[] = new int[26];
            for(int i=0;i<sentence.length();i++){
                char ch = sentence.charAt(i);
                int index=ch - 97;
                arr[index]=1;
            }
            
            for(int i=0;i<26;i++){
                if(arr[i]== 0)
                    return false;
            }
            return true;
        }
        return false;
    }
}