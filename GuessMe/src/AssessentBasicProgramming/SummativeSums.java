package AssessentBasicProgramming;


public class SummativeSums {
    public static void main(String[] args) {
// initialise an array of arrays containing the integer values
        int[][] arrays = { { 1, 90, -33, -55, 67, -16, 28, -55, 15 }, { 999, -60, -77, 14, 160, 301 }, {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99 }};

// for loop to iterate through each array
        for (int i = 0; i < arrays.length; i++) {

            // initialise integer to represent values in array
            int j;
            // intialise integer to store the total for each array
            int sumNum = 0;
// for loop to iterate through the individual values within each array
            for (j = 0; j < arrays[i].length; j++)
                // each value added and stored in variable sumNum
                sumNum += arrays[i][j];
            // prints to console the array sum
            {System.out.println("Array Sum: " + sumNum);}}}}