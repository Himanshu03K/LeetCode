class Solution {
    static int sqr(int n){
        int res=0;
        while(n>0){
            res+=(n%10)*(n%10);
            n/=10;
        }
        return res;
    }
    public boolean isHappy(int n) {
        
        while(n>9){
            n=sqr(n);
        }
        
        return n==1||n==7 ;
    }
}
