public class spiral_matrix {
    public static void Spiralmatrix(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        

        while(startRow <= endRow && startCol <= endCol){
            // top 
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            // right 
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            // bottom
            for(int j=endCol-1; j>=startCol; j--){
                // if(startRow==endRow){
                //     break;
                // }
                System.out.print(matrix[endRow][j]+" ");
            }

            // left 
            for(int i=endRow-1; i>=startRow+1; i--){
                // if(startCol==endCol){
                //     break;
                // } 
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,1,1,1,1}};
                        // System.out.println(matrix.length);
                        // System.out.println(matrix[0].length);
                Spiralmatrix(matrix);
    }
}
