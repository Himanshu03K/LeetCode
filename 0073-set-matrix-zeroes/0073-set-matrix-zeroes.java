class Solution {
    public void setZeroes(int[][] matrix) {
        // int []r=new int[matrix[0].length];
        // int []c=new int[matrix.length];
        
        ArrayList<Integer> r = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        
        // int lr=0,lc=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    r.add(i);
                    c.add(j);
                }   
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(r.contains(i) || c.contains(j))
                    matrix[i][j]=0;
            }
        }
    }
}