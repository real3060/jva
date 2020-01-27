package com.java24hours;

import java.awt.*;
import java.nio.channels.Pipe;
import java.util.ArrayList;

public class Battlepoint {
    ArrayList<Point> targets = new ArrayList<Point>();

    public Battlepoint( ) {
        createTargets();
        showMap();
        shoot(7,4);
        shoot(3,4);
        shoot(5,4);
        showMap();
    }

    private void showMap () {
        System.out.println("\n   1  2  3  4  5  6  7  8  9");
        for (int row = 1; row < 10; row++){
            for (int col = 1; col < 10; col++){
                if(col == 1){
                    System.out.print(row + " ");
                }
                System.out.print(" ");
                Point cell = new Point(col, row);
                if(targets.indexOf(cell) > -1){
                    //target is this point
                    System.out.print("X");
                } else {
                    //target is empty
                    System.out.print(".");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void shoot(int x, int y) {
        Point shot = new Point(x,y);
        System.out.print("Стреляем по (" + x + "," + y + ")...");
        if(targets.indexOf(shot) > -1) {
            System.out.println("вы потопили боевой корабль!");
            //del target
            targets.remove(shot);
        } else {
            System.out.println("fool");
        }
    }
    private void createTargets() {
        Point p1 = new Point(5,9);
        targets.add(p1);
        Point p2 = new Point(3,4);
        targets.add(p2);
        Point p3 = new Point(3,2);
        targets.add(p3);
    }

    public static void main(String[] args) {
        new Battlepoint();
    }
}
