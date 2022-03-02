public class ArrayCalculations {

    public static int rowSum(int[][] arr, int row) {

        if (row > arr.length || row < 0) {
            return -1;
        }
        int total = 0;
        for (int col = 0; col < arr[row].length; col++) {
            total += arr[row][col];
        }

        // create a variable to keep track of the total


        /* Check to see if the given row variable is valid. If the row is less than 0
        or is greater than he number of rows it is not valid. Return -1 if not valid.
         */


        /* if row is valid, create a loop to calculate the sum. hint: elements in a 2D array are found like this:
        arr[row][column]. If you are finding the sum of a row, the [row] number will not change
        only the [column] part will.
         */


        // return the total
        return total;
    }

    public static int columnSum(int[][] arr, int col) {
        int total = 0;
        if (col > arr[0].length || col < 0) {
            return -1;
        }
        ;
        for (int row = 0; row < arr.length; row++) {
            total += arr[row][col];
        }
        // create a variable to keep track of the total


        /* check to see if the given col variable is valid. If col is less than 0 or is greater than
        the number of columns (the length of one array) it is not valid. Return -1 if not valid.
         */


        /* if col is valid, create a loop to calculate the sum. hint: elements in a 2D array are found like this:
        arr[row][column]. If you are finding the sum of a col, the [column] number will not change,
        only the [row] part will.
         */

        // return the total
        return total;
    }

    public static int diagonalSum(int[][] arr, int direction) {
        if (direction > 1 || direction < 0) {
            return -1;
        }
        if (direction == 1) {
            int total = 0;
            int col2 = arr.length;
            for (int row = 0; row < arr.length; row++) {
                total += arr[row][col2];
                col2--;
            }

            return total;
        } else {
            int total = 0;
            int col2 = arr.length;
            for (int row = 0; row < arr.length; row++) {
                total += arr[row][col2];
                col2--;
            }

            return total;
        }


    }
}
