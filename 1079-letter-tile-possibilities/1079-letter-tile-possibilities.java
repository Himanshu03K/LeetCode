class Solution {
    
    public static int count(String str,int [] arr){
        int cnt=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 1){
                char ch =(char)(i+'A');
                arr[i]--;
                cnt+=count(str+ch,arr)+1;
                arr[i]++;
            }
        }
        return cnt;
    }
    public int numTilePossibilities(String tiles) {
        int arr[] = new int[26];
        for (int i = 0; i < tiles.length(); i++) {
            int idx=tiles.charAt(i)-'A';
            arr[idx]+=1;
        }
        
        return count(tiles,arr);
    }
}