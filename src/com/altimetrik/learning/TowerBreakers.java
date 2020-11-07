package com.altimetrik.learning;

import java.util.*;

public class TowerBreakers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            int n = input.nextInt();
            int m = input.nextInt();

            if(n%2==0 || m==1)
                System.out.println("2");
            else
                System.out.println("1");
        }
        
        input.close();
    }
}
