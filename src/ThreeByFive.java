public class ThreeByFive {

    public static void main(String [] args) {
// note...this is a 2x5 int array
// a 3x5 array is required
        int[][] nums = { {3,6,2,9,7}, {7,45,9,12,44}, {9,37,63,2,33} };

//this output is incomplete for this array
        System.out.print(nums[0][0] + " ");
        System.out.print(nums[0][1] + " ");
        System.out.print(nums[0][2] + " ");
        System.out.print(nums[0][3] + " ");
        System.out.println(nums[0][4]);
        System.out.print(nums[1][0] + " ");
        System.out.print(nums[1][1] + " ");
        System.out.print(nums[1][2] + " ");
        System.out.print(nums[1][3] + " ");
        System.out.println(nums[1][4]);
        System.out.print(nums[2][0] + " ");
        System.out.print(nums[2][1] + " ");
        System.out.print(nums[2][2] + " ");
        System.out.print(nums[2][3] + " ");
        System.out.println(nums[2][4]);

//change three other values to negative numbers
        nums[1][4] = -4;
        nums[2][3] = -31;
        nums[0][1] = -16;
        nums[0][3] = -3;

//make a statement to create a blank line here

// output all of the numbers again,
// not just the changed ones
        System.out.print(nums[0][0] + " ");
        System.out.print(nums[0][1] + " ");
        System.out.print(nums[0][2] + " ");
        System.out.print(nums[0][3] + " ");
        System.out.println(nums[0][4]);
        System.out.print(nums[1][0] + " ");
        System.out.print(nums[1][1] + " ");
        System.out.print(nums[1][2] + " ");
        System.out.print(nums[1][3] + " ");
        System.out.println(nums[1][4]);
        System.out.print(nums[2][0] + " ");
        System.out.print(nums[2][1] + " ");
        System.out.print(nums[2][2] + " ");
        System.out.print(nums[2][3] + " ");
        System.out.println(nums[2][4]);
    }
}

