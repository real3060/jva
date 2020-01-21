package com.java24hours;

public class ModemTester {
    public static void main(String[] args) {
        CableModem surfBoard = new CableModem();
        DslModem gateway = new DslModem();
        Commodore64Modem commodore64 = new Commodore64Modem();
        surfBoard.speed = 500000;
        gateway.speed = 40000;
        commodore64.speed = 300;
        System.out.println("Попытка подключения commodore64 модема:");
        commodore64.connect();
        System.out.println("Попытка подключения кабельного модема:");
        surfBoard.displaySpeed();
        surfBoard.connect();
        System.out.println("попытка подключения  DSL - соединения:");
        gateway.displaySpeed();
        gateway.connect();


        gateway.disconnect();
    }
}
