package com.altimetrik.learning;

import java.util.Scanner;

public class AppleAndOrange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        //Number of apples falling on the house
        int applesOnHouse = 0;
        for (int i = 0; i < m; i++) {
            int applePosition = a + scanner.nextInt();
            if (applePosition >= s && applePosition <= t) {
                applesOnHouse++;
            }
        }
        System.out.println(applesOnHouse);

        //Number of oranges falling on the house
        int orangesOnHouse = 0;
        for (int i = 0; i < n; i++) {
            int orangePosition = b + scanner.nextInt();
            if (orangePosition >= s && orangePosition <= t) {
                orangesOnHouse++;
            }
        }
        System.out.println(orangesOnHouse);

        scanner.close();
    }
}