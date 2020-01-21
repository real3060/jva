package com.java24hours;

public class CableModem extends Modem {
    String method = "кабельное соединение";
    public void connect() {
        System.out.println("Подключение к интернету...");
        System.out.println("Используем " + method);
    }
}
