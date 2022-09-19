package Easy;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k=nums.length;
        int arr[]= new int[k];
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val)
                k--;
            else
                arr[c++] = nums[i];
            
        }
        for(int i =0;i<c;i++)
        nums[i] = arr[i];
        return k;
    }
}
