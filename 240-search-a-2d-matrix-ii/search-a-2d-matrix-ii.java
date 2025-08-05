class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
    
        int row = 0;        // start from first row
        int col = n - 1;    // start from last column 

        while (row < m && col >= 0) {
           int current = matrix[row][col];
        
           if (current == target) {
            return true;
           } 
           else if (current > target) {
            // move left
             col--;
           }
           else {
            // move down
            row++;
          }
        }
    return false;
    }
    public static void main(String[] args){
        int matrix[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(searchMatrix(matrix,5));

    }
}

        
    
