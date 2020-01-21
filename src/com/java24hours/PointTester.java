package com.java24hours;

import java.awt.*;

public class PointTester {
    public static void main(String[] arguments) {
        Point location1 = new Point(11, 22);
        Point3D location2 = new Point3D(7, 6, 64);
        Point4D location3 = new Point4D(4,10,13,33);
        System.out.println("Двyмepнaя точка находится в ( " + location1.x + " , " + location1.y + " ) ");
        System.out.println(" Oнa перемеща ется в ( 4 , 1 3 ) ");
        location1.move(4, 13);
        System.out.println(" Teпepь двумерная точка находится в ( " +
                location1.x + " , " + location1.y + " ) ");
        System.out.println(" Oнa перемещена на -10 единиц по оси " +
                " х и по оси у ");
        location1.translate(-10, -10);
        System.out.println(" Теперь двумерная точка находится в ( " +
                location1.x + " , " + location1.y + " ) \n ");
        System.out.println(" Tpexмepнaя точка находится в ( " +
                location2.x + " , " + location2.y + " , " +
                location2.z + " ) ");
        System.out.println(" Oнa перемещается в ( 10,22,71 ) ");
        location2.move(10,22,71);
        System.out.println(" Теперь трехмерная точка находится в ( " +
                location2.x + " , " + location2.y + " , " +
                location2.z + " ) ");
        System.out.println(" Oнa перемещена на - 20 единиц по осям " +
                " х , у и оси z ");
        location2.translate(-20, -20, -20);
        System.out.println(" Teпepь трехмерная точка находится в ( " +
                location2.x + " , " + location2.y + " , " +
                location2.z + " ) ");


        System.out.println(" 4xmernaya точка находится в ( " +
                location2.x + " , " + location2.y + " , " +
                location2.z + " ) ");
        System.out.println(" Oнa перемещается в ( 10,22,71 ) ");
        location2.move(10,22,71);
        System.out.println(" Теперь 4x точка находится в ( " +
                location2.x + " , " + location2.y + " , " +
                location2.z + " ) ");
        System.out.println(" Oнa перемещена на - 20 единиц по осям " +
                " х , у, z и оси t ");
        location2.translate(-20, -20, -20);
        System.out.println(" Teпepь 4xmernaya точка находится в ( " +
                location3.x + " , " + location3.y + " , " +
                location3.z + " ) ");

    }
}
