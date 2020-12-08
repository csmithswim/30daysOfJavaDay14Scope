package com.csmithswim;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    Difference(int[] elements){
        this.elements=elements;

    }

    void computeDifference(){
        maximumDifference=0;
        Arrays.sort(elements);

        for (int i = 0; i <= elements.length-1; i++) {
            if (maximumDifference<(Math.abs(elements[elements.length-1]-elements[i]))){
                maximumDifference=Math.abs(elements[elements.length-1]-elements[i]);
            }
        }
    }
} // End of Difference class

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
