package com.altimetrik.learning;

import java.util.*;

public class MiniMaxSum {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        long[] arr = new long[5];
        for(int i=0; i<5; i++)
        {
            arr[i] = input.nextLong();
        }
        Arrays.sort(arr);
        long min = arr[0] + arr[1] + arr[2] + arr[3];
        long max = arr[4] + arr[1] + arr[2] + arr[3];
        System.out.print(min + " " + max);

        input.close();
    }
}
