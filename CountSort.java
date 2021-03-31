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
public class CountSort {

    public static int countSort(int[] a) {
        //counter for time complexity
        int timeCompCounter = 0;

        int copies = a.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                //Counting (a[i] > max)
                timeCompCounter++;
                min = a[i];
            }
            if (a[i] > max) {
                //Counting (a[i] > max)
                timeCompCounter++;
                max = a[i];
            }

        }

        int[] frequencies = new int[max - min + 1];

        for (int i = 0; i < a.length; i++) {

            int number = a[i];

            frequencies[number - min] = frequencies[number - min] + 1;
            //counting (frequencies[number - min] = frequencies[number - min] + 1)
            timeCompCounter++;
        }

        int outPos = 0;

        for (int i = 0; i < frequencies.length; i++) {
            for (int j = 0; j < frequencies[i]; j++) {
                //counting (j < frequencies[i])
                timeCompCounter++;
                a[outPos++] = i + min;
                //counting (a[outPos++] = i + min)
                timeCompCounter++;
            }
        }
        //returns time complexity as there is nothing else to return
        return timeCompCounter;
    }
}
