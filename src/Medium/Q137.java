package Medium;

class Solution {
    public int singleNumber(int[] nums) {
     
        int n=nums.length;
    int count[] = new int[32]; 

    
    for (int i = 0; i < 32; i++) 
        for (int j = 0; j < n; j++) 
            if ((nums[j] & (1 << i)) != 0) 
                count[i] += 1; 

   
    int res = 0; 
    for (int i = 0; i < 32; i++) 
        res += (count[i] % 3) * (1 << i); 
    return res; 
    }
}
