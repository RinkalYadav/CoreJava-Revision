package com.basic.LogicAndMixed;

import java.util.Scanner;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number:");

        int n = sc.nextInt();

        while (n > 0) {
            int r = n % 2;
            System.out.print(r);
            n = n / 2;
        }
    }
}