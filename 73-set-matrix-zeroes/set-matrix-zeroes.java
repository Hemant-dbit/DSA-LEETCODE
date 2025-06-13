class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        //Check first row and first col contains zero
        for(int r = 0; r < row; r++){
            if(matrix[r][0] == 0){
                firstColZero = true;
                break;
            }
        }

        for(int c = 0; c < col; c++){
            if(matrix[0][c] == 0){
                firstRowZero = true;
                break;
            }
        }

        //Use first row and col as markers
        for(int r = 1; r < row; r++){
            for(int c = 1; c < col; c++){
                if(matrix[r][c] == 0){
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;
                }
            }
        }

        //Set marked rows to zero
        for(int r = 1; r < row;r++){
            if(matrix[r][0] == 0){
                for(int c = 1; c < col; c++){
                    matrix[r][c] = 0;
                }
            }
        }

        //Set the marked col as zero
        for(int c = 1; c < col;c++){
            if(matrix[0][c] == 0){
                for(int r = 1; r < row; r++){
                    matrix[r][c] = 0;
                }
            }
        }

        //Mark the first row as zero
        if(firstRowZero){
            for(int c = 0; c < col; c++){
                matrix[0][c] = 0;
            }
        }

        //Mark the first row as zero
        if(firstColZero){
            for(int r = 0; r < row; r++){
                matrix[r][0] = 0;
            }
        }

        
    }
}