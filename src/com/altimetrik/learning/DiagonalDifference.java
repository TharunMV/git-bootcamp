package com.altimetrik.learning;

import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) {

        int n,i,j,diff;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[][] a = new int[n][n];
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                a[i][j] = input.nextInt();
            }
        }
        int pd=0,npd=0;
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                if(j == i) {
                    pd += a[i][j];
                }
                if(i == n-j-1){
                    npd += a[i][j];
                }
            }
        }
        diff = npd-pd;
        diff = Math.abs(diff);
        System.out.println(diff);

        input.close();
    }
}
