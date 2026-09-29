public class Search {
    public static boolean Search_Sorted(int matrix[][], int key) {
        int Row = 0;
        int Col = matrix[0].length - 1;
        while (Row < matrix.length && Col >= 0) {
            if (matrix[Row][Col] == key) {
                System.out.println("Found at: (" + Row + "," + Col + ")");
                return true;
            } else if (key < matrix[Row][Col]) {
                Col--;
            } else {
                Row++;
            }
        }
        System.out.println("Not Found");
        return false;

    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        Search_Sorted(matrix, 30);
    }
}
