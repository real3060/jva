package com.java24hours;


public class Point4D extends Point3D {
    public int t;

    public Point4D(int x, int y, int z, int t) {
        super(x, y, z);
        if (this.t > 0) {
            this.t = t;
        }
    }

}
