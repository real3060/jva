package com.java24hours;

import java.awt.*;

public class Point3D extends Point {
    public int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    public void translate (int x, int y, int z) {
        this.z +=z;
        super.translate(x,y);
    }
    public void move(int x, int y, int z) {
        super.move(x,y);
        this.z = z;
    }
}
