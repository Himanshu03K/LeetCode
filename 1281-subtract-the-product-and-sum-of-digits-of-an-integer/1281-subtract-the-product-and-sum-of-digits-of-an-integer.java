class Solution {
    public int subtractProductAndSum(int n) {
        
        int ans=1,sum=0;
        while(n>0){
            int r=n%10;
            
            ans*=r;
            sum+=r;
            n/=10;
        }
        return ans-sum;
    }
}