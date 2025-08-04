class Solution {
     public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int sr = 0;                 // start row
        int sc = 0;                 // start column
        int er = matrix.length - 1; // end row
        int ec = matrix[0].length - 1; // end column

        while (sr <= er && sc <= ec) {
            // top row
            for (int j = sc; j <= ec; j++) {
                result.add(matrix[sr][j]);
            }
            // right column
            for (int i = sr + 1; i <= er; i++) {
                result.add(matrix[i][ec]);
            }
            // bottom row
            if (sr < er) {
                for (int j = ec - 1; j >= sc; j--) {
                    result.add(matrix[er][j]);
                }
            }
            // left column
            if (sc < ec) {
                for (int i = er - 1; i > sr; i--) {
                    result.add(matrix[i][sc]);
                }
            }

            sr++;
            sc++;
            er--;
            ec--;
        }
        return result;
    }

    public static void main(String[] args){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        
    }
}
     
    
    

   