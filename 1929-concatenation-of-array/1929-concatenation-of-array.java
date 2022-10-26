class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int[] ans=new int[len*2];
        
        int i=0,k=0;
        while(i<len*2){
            if(i==len){
                k=0;
            }
            ans[i]=nums[k++];
            i++;
        }
        return ans;
    }
}