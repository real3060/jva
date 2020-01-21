package com.java24hours;

public class GremlinLab {
    public static void  main (String[] args) {
        int numGremlins = Integer.parseInt(args[0]);
        if(numGremlins > 0) {
            Gremlin[] gremlins = new Gremlin[numGremlins];
            for (int i = 0; i < numGremlins; i++){
                gremlins[i] = new Gremlin();
            }
            System.out.println("Здесь " + Gremlin.getGremlinCount() + " гремлинов.");
        }
        Gremlin gremlin1 = new Gremlin();
        int guid = 1_010_101;
        if(guid > 1_000_000 & guid < 9_999_999){
            gremlin1.setGuid(guid);
            System.out.println("Получение приватного значения guid: " + gremlin1.getGuid());
        }
    }
}
