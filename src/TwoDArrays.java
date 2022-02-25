public class TwoDArrays {

    public static int maxValue(int[][] arr) {

        int value = arr[0][0];
        int temp = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length-1; col++) {
                if (arr[row][col] > arr[row][col + 1]) {
                    temp = arr[row][col];
                    if(temp>value) {
                        value = temp;
                    }
                }
                else if (arr[row][col] < arr[row][col + 1]) {
                    temp = arr[row][col + 1];
                    if(temp>value) {
                        value = temp;
                    }
                }
            }
        }
        return value;
    }

    public static int sumAll(int[][] arr) {
        int sum = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                sum+= arr[row][col];
            }
        }

        return sum;
    }

//    /*
    public static int[][] squareArray(int num) {
        int [][] squareArray = new int [num][num];
        for (int row = num-1; row >= 0; row--) {
            for (int col = num-1; col >= 0; col--) {
                squareArray[row][col] = num - col;
                if (num-(col)<=0) {
                    squareArray[row][col] = 0;
                }
            }
        }
        return squareArray;
    }

//     */


}
