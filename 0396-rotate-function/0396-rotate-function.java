class Solution {
    public int maxRotateFunction(int[] nums) {
        int len=nums.length;
        int sum=0,sum2=0;
        for(int i=0;i<len;i++){
            sum+=nums[i];
            sum2+=(i*nums[i]);
        }
        int ans=sum2;
        for(int i=len-1;i>=0;i--){
            sum2 = sum2 + sum - (len* nums[i]);
            ans=Math.max(ans,sum2);
        }
        return ans;        
    }
}