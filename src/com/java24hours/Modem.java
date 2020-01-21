package com.java24hours;

public class Modem {
    int speed;
    public void displaySpeed() {
        System.out.println("Быстродействие: " + speed);
    }

    public static void main(String[] args){
        Modem device = new Modem();
        device.speed = 28800;
        device.displaySpeed();
    }
}
