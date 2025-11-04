package datastructure.array;


public class javaArray {

    // When creating any type of array with no default value, its as follows.
    // Type [] <arrayName>;
    static String [] cars = {"BMW", "Honda", "Ford"};

    // Creating empty String Array with no values.
    String[] animals = new String[4]; // c is 4


    // Accessing an element in an array is as follows.
    // cars[0] returns the value "BMW"

    // Reassign element of an array
    public void setCarInArray(int index, String carBrand){
        if(index < 0 || index > cars.length){
            throw new IllegalArgumentException("Index Argument of [0 - " + (cars.length - 1) + "] only allowed.");
        }else{
            cars[index] = carBrand;
        }
    }

    public static void main(String[] args) {
        javaArray demo = new javaArray();
        demo.setCarInArray(1, "GMC");

        // Example of normal Array loop iteration
        for(int i = 0 ; i < cars.length ; i++){
            System.out.println("Normal forLoop(): " + cars[i]);
        }

        // Enhanced loop iteration
        for(String car: cars){
            System.out.println("For-Each loop: " + car);
        }

        // Iterating over a array finding the MIN and MAX values. 
        int[] Numbers = {1983,1,2,3,5,0};
        int maxNum = Numbers[0];
        int minNum = Numbers[0];

        for(int n: Numbers){
            if(n > maxNum) maxNum = n; // if n is greater then maxNum, which is assigned first value in array. 
                                       // Then reassign it with the value highest until loop ends.
            else if(n < minNum) minNum = n; // if n i less than Numbers at index 0 than keep looping until the lowest value is reached. 
        }
        // System.out.println("Max: " + maxNum + "\nMin: " + minNum);


        // MULTIDIMENSIONAL ARRAYs

        int[][][] multiDimensionalNum = {{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}}};
        // ROWS start at 0 ; indexes starts at 0
        // System.out.println(multiDimensionalNum[1][2]); // Outputs 7
        // RE-ASSIGN value in multi-dimensional Array.
        // ENSURE new assigned value matches!
        try {
            multiDimensionalNum[0][0][0] = 10;
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }

        // ENHANCED FOR LOOP for multiDimensionalArrays
        // 1st for(): Iterating accessing each sub-array within multiDimensionalNum
        // 2nd for(): Iterating over newly temp sub-arrays defined in the 1st loop
        // to access every single index within each element 
        for(int [][] accessedRows: multiDimensionalNum)for(int[] num: accessedRows)for(int index: num){
            System.out.println(index);
        }
    }
    
}
