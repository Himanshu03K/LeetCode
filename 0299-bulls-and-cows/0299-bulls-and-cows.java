class Solution {
    public String getHint(String secret, String guess) {
        int bull=0;
        int[] map=new int[10];
        char[] s=secret.toCharArray();
        char[] g=guess.toCharArray();
        for(int i=0;i<s.length;i++){
            int x=s[i]-'0';
            int y=g[i]-'0';
            if(s[i]-g[i]==0){
                bull++;
            }
            else{
                map[x]++;
                map[y]--;
            }
        }
        int sum=0;
        for(int num:map){
            if(num>0){
                sum+=num;
            }
        }
        return bull+"A"+(s.length-bull-sum)+"B";
        
    }
}