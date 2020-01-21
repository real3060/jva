package com.java24hours;

public class DslModem  extends  Modem{
    String method = "DSL - соединение";
    public void connect() {
        System.out.println("Подключение к интернету...");
        System.out.println("Используем метод " + method);
    }
    public void disconnect() {
        System.out.println("Инициализировано отключение..." + method + " будет отключено");
        System.out.println(method + " отключено");
    }
}
