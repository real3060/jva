package com.java24hours;

public class NewRoot {
    public static void main(String[] args) {
        int number = 100;
        if(args.length != 0) {
            number = Integer.parseInt(args[0]);
        }
        System.out.println("Квадратный корень из " + number + " равен " + Math.sqrt(number));
    }
}
