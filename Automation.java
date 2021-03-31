/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cm2100c2p2;

import java.io.IOException;
import java.util.Arrays;
import java.io.FileWriter;

/**
 *
 * @author Matthew Hutcheson 1812425
 */
public class Automation {

    public static void main(String[] args) throws IOException {
        //int[] testarray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //System.out.println("Array: " + Arrays.toString(testarray) + "\naverage: " + getAverage(testarray, testarray.length));

        ////count sort time complexity -----------------------------------------------------------------------------------------------------------------
        //creates 2d array to store all the arrays of values of time complexities
        int[][] CSarrayOfComplexitiesOfValues = new int[100][100];

        //loop that calls the get complexity function, that gets the arrays and stores them in the 2d array
        for (int i = 0; i < 100; i++) {
            //it has a + 5 so that the array lengths have a more meaningful start
            CSarrayOfComplexitiesOfValues[i] = getcomplexityCS(i + 5);
        }

        //creates an array to store the averages
        int[] CSarrayOfAverages = new int[100];

        //for loop that goes through each array in the 2d array and uses the average function to find their average then adds it to the average array
        for (int m = 0; m < 100; m++) {
            CSarrayOfAverages[m] = getAverage(CSarrayOfComplexitiesOfValues[m]);
        }
        //print statement to ensure csv data has updated
        System.out.println("count sort time complexities: " + Arrays.toString(CSarrayOfAverages));
        //End of Count Sort Time complexity code

        ////insertion sort time complexity -----------------------------------------------------------------------------------------------------------------
        //creates 2d array to store all the arrays of values of time complexities
        int[][] ISarrayOfComplexitiesOfValues = new int[100][100];

        //loop that calls the get complexity function, that gets the arrays and stores them in the 2d array
        for (int i = 0; i < 100; i++) {
            //it has a + 5 so that the array lengths have a more meaningful start
            ISarrayOfComplexitiesOfValues[i] = getcomplexityIS(i + 5);
        }

        //creates an array to store the averages
        int[] ISarrayOfAverages = new int[100];

        //for loop that goes through each array in the 2d array and uses the average function to find their average then adds it to the average array
        for (int m = 0; m < 100; m++) {
            ISarrayOfAverages[m] = getAverage(ISarrayOfComplexitiesOfValues[m]);
        }
        //print statement to ensure csv data has updated
        System.out.println("insertion sort time complexities: " + Arrays.toString(ISarrayOfAverages));
        //End of Insertion Sort Time complexity code

        ///Code to create and write to csv file-----------------------------------------------------------------------------------------------------------
        //creates array length array so that the array length axis can more easily be plotted 
        int[] arrayLength = new int[100];

        //popuating arrayLength with values 1-100 for lengths of the arrays
        for (int i = 0; i < 100; i++) {
            arrayLength[i] = i + 5;
        }

        ////Count sort csv writer
        //creates the csv file
        FileWriter writerCS = new FileWriter("CountSortTimeCOmplexitydata.csv");

        //for loop that essentially just formats the arrays into a way that can be easily read by excel and graphed
        for (int j = 0; j < arrayLength.length; j++) {
            writerCS.append(String.valueOf(arrayLength[j]));
            writerCS.append(", ");
            writerCS.append(String.valueOf(CSarrayOfAverages[j]));
            writerCS.append(",\n");
        }

        //closes the writer
        writerCS.close();

        ////Insertion sort csv creator
        //creates the csv file
        FileWriter writerIS = new FileWriter("InsertionSortTimeCOmplexitydata.csv");

        //for loop that essentially just formats the arrays into a way that can be easily read by excel and graphed
        for (int j = 0; j < arrayLength.length; j++) {
            writerIS.append(String.valueOf(arrayLength[j]));
            writerIS.append(", ");
            writerIS.append(String.valueOf(ISarrayOfAverages[j]));
            writerIS.append(",\n");
        }

        //closes the writer
        writerIS.close();
    }

    public static int getAverage(int[] complexityArr) {
        //creates sum variable and sets it to 0
        int sum = 0;

        //for loop to get sum of the array parameter passed down
        for (int i = 0; i < complexityArr.length; i++) {
            sum += complexityArr[i];
        }
        //System.out.println("sum is: " + sum +"\n complexityarr length is: " + complexityArr.length + "\n arraylength parameter is: " + arraylength);
        //returns average (sum divided by total amount of elements in array
        return sum / complexityArr.length;
    }

    public static int[] getcomplexityCS(int length) {
        // gets 100 complexites of an array of one length, that length is defined by the parameter above
        int tempLength = 100;

        //creates the array that will eventually be returned of complexities found for sorts performed on a certain array length
        int[] csTc = new int[tempLength];

        for (int i = 0; i < 100; i++) {
            //stores the time complexity of sorted random array which has a length of (length)
            csTc[i] = CountSort.countSort(generateRandomArray(length));
        }

        //outputs 1 array of 100 complexiteis for one length
        return csTc;
    }

    public static int[] getcomplexityIS(int length) {
        // gets 100 complexites of an array of one length, that length is defined by the parameter above
        int tempLength = 100;

        //creates the array that will eventually be returned of complexities found for sorts performed on a certain array length
        int[] isTc = new int[tempLength];

        for (int i = 0; i < 100; i++) {
            //stores the time complexity of sorted random array which has a length of (length)
            isTc[i] = InsertionSort.insertionSort(generateRandomArray(length));
        }

        //outputs 1 array of 100 complexiteis for one length
        return isTc;
    }

    public static int[] generateRandomArray(int size) {
        //generates an array of size passed through the parameter
        int[] theArray = new int[size];

        for (int outerCounter = 0; outerCounter < size; outerCounter++) {
            //generates an array of random numbers from 0 to the size of the array
            theArray[outerCounter] = (int) (Math.random() * 1000);
        }

        return theArray;
    }
}
