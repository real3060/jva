package com.java24hours;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] nums = new int[250];
        String names[] = {"Иван", "Дарья", "Олег", "Николай", "Святослав"};
        System.out.println("До соритровки: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ": " + names[i]);
        }
        System.out.println();
        Arrays.sort(names);
        System.out.println("после соритровки: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ": " + names[i]);
        }
        System.out.println();

        String mostFamous = "Рудольф - это олень с красным светящимся носом";

        char[] mfl = mostFamous.toCharArray();
        for (int dex = 0; dex < mfl.length; dex++) {
            char current = mfl[dex];
            if (current != ' ') {
                System.out.print(current);
            } else {
                System.out.print(".");
            }
        }
        System.out.println();

    }

    public static void notMain(String[] args) {
        boolean[][] boolArr = new boolean[50][50];
        boolArr[4][13] = true;
        boolArr[7][6] = true;
        boolArr[11][22] = true;
    }
}
