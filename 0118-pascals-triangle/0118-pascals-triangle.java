class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        
        int r =1; 
        while(r<=numRows){
            List<Integer> test= new ArrayList<>();
           for(int i=1;i<=r;i++){
               
                test.add(nCr(r-1,i-1));
                
               
            } 
            ans.add(test);
            
            r++;
        }
        return ans;
        
    }
    
    public int nCr(int n,int r){
        int  res =1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
}