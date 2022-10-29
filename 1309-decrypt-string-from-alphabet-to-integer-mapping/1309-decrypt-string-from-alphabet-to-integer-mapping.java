class Solution {
    public String freqAlphabets(String s) 
    {
        String res="";
        char ch='s';
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!='#'){
                ch=(char)(Integer.parseInt(s.substring(i,i+1))+96);
                res=ch+res;
            }
            else{
                ch=(char)(Integer.parseInt(s.substring(i-2,i))+96);
                res=ch+res;
                i=i-2;
            }
        }
        return res;
    }
}