package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        String input = scanner.nextLine();
        String[] sNumbers = input.split(" ");
        int[] numbers = new int[sNumbers.length - 1];

        for (int i = 0; i < sNumbers.length - 1; i++) {
            numbers[i] = Integer.parseInt(sNumbers[i]);
        }
        int avg = 0;
        for (int number : numbers) {
            avg += number;
        }
        System.out.println(avg / numbers.length);
    }

}