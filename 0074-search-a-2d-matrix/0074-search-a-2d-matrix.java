class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
    // Brute force     
        
        // for(int i=0;i<matrix.length;i++){
        //     for(int j =0;j<matrix[0].length;j++){
        //         if(matrix[i][j]==target)
        //             return true;
        //     }
        // }
        // return false;
        
    // Optimal
        
        int r= matrix.length;
        int c = matrix[0].length;
        int i =0,j=c-1;
        
        while(i<r && j>=0){
            if(matrix[i][j]==target)
                return true;
            
            if(matrix[i][j]> target)
                j--;
            else
                i++;
        }
        return false;
    }
}