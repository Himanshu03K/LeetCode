class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int l1=gas.length;
        int x=0,sum=0,curr=0,si=0;
        for(int i=0;i<l1;i++){
            sum+=(gas[i]-cost[i]);
            curr+=(gas[i]-cost[i]);
            if(curr<0){
                curr=0;
                si=i+1;
            }
        }
        
        if(sum<0)
            return -1;
        
        return si;
        
    }
}