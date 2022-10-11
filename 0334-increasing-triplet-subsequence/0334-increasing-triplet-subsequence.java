class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int low = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        
        for(int i : nums){
            if(i<=low)
                low = i;
            
            else if(i<= mid)
                mid = i;
            
            else 
                return true;
            
        }
        return false;
    }
}