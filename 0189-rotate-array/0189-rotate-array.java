class Solution {
    public void rotate(int[] nums, int k) {
        
        k=k%nums.length;
        
        reverse(nums,0,nums.length -1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    
    public  void reverse(int[] arr, int beg , int end){
        while(beg < end){
            int t= arr[beg];
            arr[beg]=arr[end];
            arr[end]=t;
            beg++;
            end--;
        }
    }
}