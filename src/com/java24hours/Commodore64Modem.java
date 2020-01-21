package com.java24hours;

public class Commodore64Modem extends Modem {
    String method = "commodere64";

    public void connect() {
        System.out.println("Подключение к интернету...");
        System.out.println("Используем метод " + method);
    }


}
