package com.java24hours;

public class Gremlin {
    static int gremlinCount = 0;
    private int guid;

    public Gremlin() {
        gremlinCount++;
    }

    static int getGremlinCount() {
        return gremlinCount;
    }

    void setGuid(int value) {
            this.guid = value;
    }

    int getGuid() {
        return guid;
    }
    static void main2() {

    }
}
