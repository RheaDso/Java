package com.company;

import java.util.Scanner;

public class Day5_2 {

    public static void main(String[] args)
    {
        int x, y, z;
        System.out.println("Enter two integers:");
        Scanner in = new Scanner((System.in));
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("Sum of the two integers:"+z);
    }
}
