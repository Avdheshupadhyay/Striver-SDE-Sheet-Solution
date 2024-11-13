class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         if(matrix.length == 0 || matrix[0].length == 0){
             return false;
         }
        int row = matrix.length;
        int col = matrix[0].length;
        if(target < matrix[0][0] || target > matrix[row-1][col-1]){
             return false;
        }
        for(int i = row-1,j = 0;i>=0 && j < col;){          
            if(matrix[i][j] == target) {
                 return true;
            }
            else if(matrix[i][j] < target){
                j++;
            }
            else {
                i--;
            }
        }
        return false;
    }
}