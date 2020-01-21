package com.java24hours;

public class Dex {
    public static void main(String[] arguments) {
        int myVal = 540;
        getResult(myVal);
        int val = 0;

        while (val < 6){
            if (val == 3) {
                val++;
                continue;
            }
            System.out.println("значение: " + val);
            val++;
        }
    }

    public static void getResult(int val) {
        for (; val < 1000; val++) {
            if (val % 12 == 0) {
                System.out.print("#" + val + " ");
            }
        }
        System.out.println();
    }
}
