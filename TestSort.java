/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cm2100c2p2;

import java.util.Arrays;

/**
 *
 * @author Matthew Hutcheson
 */
public class TestSort {

    public static void main(String[] args) {
        //int[] theArray = {16, 18, 9, 3, 6, 15, 11, 4, 1, 20, 19, 14, 12, 8, 10, 13, 17, 2, 5, 7};
        //int[] theSecArray = {3964, 174, 4794, 2699, 240, 4543, 3432, 1240, 1436, 348, 496, 940, 98, 2484, 1662, 3805, 770, 4983, 3338, 2711};
       
        
        CountSort firstSort = new CountSort();
        InsertionSort secondSort = new InsertionSort();
        CountSort thirdSort = new CountSort();
        InsertionSort fourthSort = new InsertionSort();
        
        
       // ranArray1 = new ArrayGenerator();
       
       //int[] ranArrayOne = ranArray1.generateRandomArray(23);
       
        //System.out.println(Arrays.toString(ranArrayOne));
       
       System.err.println("FIRST TEST-----------------------------------------------------------------------------------------------------------");
        
       // System.out.println("unsorted random array: " + Arrays.toString(ranArrayOne));

        //int[] CountSortedArray = firstSort.countSort(ranArrayOne);
        //System.out.println("Count sorted array: " + Arrays.toString(CountSortedArray));

        
        for (int i = 0; i < 100; i++) {
            
        }
        
        //int[] InsertionSortedArray = secondSort.insertionSort(theArray);
        //System.out.println("Insertion sorted array: " + Arrays.toString(InsertionSortedArray));
        
        //System.err.println("SECOND TEST-----------------------------------------------------------------------------------------------------------");
        
        //System.out.println("The second unsorted random array: " + Arrays.toString(theSecArray));

        //int[] CountSortedArraySec = thirdSort.countSort(theSecArray);
        //System.out.println("Count sorted array: " + Arrays.toString(CountSortedArraySec));

        //int[] InsertionSortedArraySec = fourthSort.insertionSort(theSecArray);
        //System.out.println("Insertion sorted array: " + Arrays.toString(InsertionSortedArraySec));
        
        
    }
    
}
