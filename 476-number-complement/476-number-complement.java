class Solution {
    public int findComplement(int num) {
        int c=0,temp=num;
        
        while(num>0){
            c=c << 1;
            c=c^1;
            num =num >> 1;
        }
        return c ^ temp;
    }
}
