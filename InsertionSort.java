/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cm2100c2p2;

/**
 *
 * @author Matthew Hutcheson
 */
public class InsertionSort {

    public static int insertionSort(int[] a) {
        //counter for time complexity
        int counterTimeComplex = 0;

        for (int i = 0; i < a.length; i++) {
            int valToInsert = a[i];
            int insertPosition = i;

            while (insertPosition > 0 && a[insertPosition - 1] > valToInsert) {
                //counting the comparison in while (a[insertPosition - 1] > valToInsert)
                counterTimeComplex++;

                a[insertPosition] = a[insertPosition - 1];
                //counting the overwrite (a[insertPosition] = a[insertPosition - 1])
                counterTimeComplex++;

                insertPosition = insertPosition - 1;

            }
            a[insertPosition] = valToInsert;
            //counting the overwrite (a[insertPosition] = valToInsert;)
            counterTimeComplex++;

        }
        //retunring time complexity because we dont need to return anything else
        return counterTimeComplex;
    }
}
