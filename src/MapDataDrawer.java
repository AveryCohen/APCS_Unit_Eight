import java.util.*;
import java.io.*;
import java.awt.*;

public class MapDataDrawer
{

    private int[][] grid;

    public MapDataDrawer(String filename, int rows, int cols) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("files/Colorado_844x480.dat"));
        grid = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                grid[row][col] = scan.nextInt();
            }
        }
        // initialize grid
        //read the data from the file into the grid
    }

    /**
     * @return the min value in the entire grid
     */
    public int findMinValue(){
        int value = grid[0][0];
        int temp = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length-1; col++) {
                if (grid[row][col] < grid[row][col + 1]) {
                    temp = grid[row][col];
                    if(temp<value) {
                        value = temp;
                    }
                }
                else if (grid[row][col] > grid[row][col + 1]) {
                    temp = grid[row][col + 1];
                    if(temp<value) {
                        value = temp;
                    }
                }
            }
        }
        return value;
    }
    /**
     * @return the max value in the entire grid
     */
    public int findMaxValue(){
        int value = grid[0][0];
        int temp = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length-1; col++) {
                if (grid[row][col] > grid[row][col + 1]) {
                    temp = grid[row][col];
                    if(temp>value) {
                        value = temp;
                    }
                }
                else if (grid[row][col] < grid[row][col + 1]) {
                    temp = grid[row][col + 1];
                    if(temp>value) {
                        value = temp;
                    }
                }
            }
        }
        return value;
    }

    /**
     * @param col the column of the grid to check
     * @return the index of the row with the lowest value in the given col for the grid
     */
    public  int indexOfMinInCol(int col){
        int indexValue = 0;
        int indexTemp = 0;
        int value = grid[0][col];
        int temp = 0;
        for (int row = 0; row < grid.length; row++) {
            if (grid[row][col] < grid[0][col]) {
                indexTemp = row;
                temp = grid[row][col];
                if (temp < value) {
                    indexValue = indexTemp;
                    value = temp;
                }
            }
        }
        return indexValue;
    }

    /**
     * Draws the grid using the given Graphics object.
     * Colors should be grayscale values 0-255, scaled based on min/max values in grid
     */
    public void drawMap(Graphics g) {
            for (int row = 0; row < grid.length; row++) {
                for (int col = 0; col < grid[0].length; col++) {
                int pixel = grid[row][col];
                if (pixel == 4334) {
                    int c = 255;
                    g.setColor(new Color(c, c, c));
                    g.fillRect(col, row, 1, 1);
                }
                else if (pixel == 1099) {
                    int c = 0;
                    g.setColor(new Color(c, c, c));
                    g.fillRect(col, row, 1, 1);
                }
                else {
                    double x = ((pixel-1099)/3235.0) * 255.0;
                    int c = (int) x;
                    g.setColor(new Color(c, c, c));
                    g.fillRect(col, row, 1, 1);
                }

            }
        }






    }

    /**
     * Find a path from West-to-East starting at given row.
     * Choose a foward step out of 3 possible forward locations, using greedy method described in assignment.
     * @return the total change in elevation traveled from West-to-East
     */
    public int drawLowestElevPath(Graphics g, int row){
        for (int col = 0; col < grid.length-1; col++) {

        }
        return -1;
    }

    /**
     * @return the index of the starting row for the lowest-elevation-change path in the entire grid.
     */
    public int indexOfLowestElevPath(Graphics g){
        return -1;

    }


}