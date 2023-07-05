class Solution {
    public int findMaximumXOR(int[] n) {
        Set<Integer> set = new HashSet<>();
        int mask = 0;
        int max = 0;
        for(int r : n) max = max >= r ? max : r;
        int leftmost = 0;
        while(max>0){
            leftmost++;
            max = max >>1;
        }
        for(int i = leftmost; i >=0; i--) {
            mask |= 1<<i;
            set.clear();
            int tmp = max | (1<<i);
            for(int s : n) {
                if(set.contains((s & mask)^tmp)){
                    max = tmp;
                    break;
                }
                set.add(s & mask);
            }
        }
        return max;
    }
}