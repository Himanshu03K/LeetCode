class Solution {
    public int xorOperation(int n, int start) {
        int x=0;
        // for(int i=start;i<2*n*(start+1);i=i+2){
        //     x^=i;
        // }
        
        while(n-- >0){
            x^=start;
            start+=2;
        }
        return x;
    }
}