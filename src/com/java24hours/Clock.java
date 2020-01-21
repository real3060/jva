package com.java24hours;

import java.time.*;
import java.time.temporal.*;

public class Clock {
    public static void main(String[] args) {
        // определить текущуее вермя и дату
        LocalDateTime now = LocalDateTime.now();
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        int minute = now.get(ChronoField.MINUTE_OF_HOUR);
        int month = now.get(ChronoField.MONTH_OF_YEAR);
        int day = now.get(ChronoField.DAY_OF_MONTH);
        int year = now.get(ChronoField.YEAR);

        if (hour < 12) {
            System.out.println("Good morning!\n");
        } else if (hour < 17) {
            System.out.println("Good day!\n");
        } else {
            System.out.println("Good evening\n");
        }

        System.out.print("Now: ");

        System.out.print(hour);
        System.out.print((hour != 1 & hour!= 21) ? " hours " : "hour");

        if(minute != 0){
            System.out.print(minute + " minutes");
        }

        System.out.print("\n" + day + " ");

        // month name

        switch (month) {
            case 1:
                System.out.print("January"); break;
            case 2: System.out.print("February"); break;
            case 3: System.out.print("March"); break;
            case 4: System.out.print("April"); break;
            case 5: System.out.print("May"); break;
            case 6: System.out.print("June"); break;
            case 7: System.out.print("July"); break;
            case 8: System.out.print("August"); break;
            case 9: System.out.print("September"); break;
            case 10: System.out.print("October"); break;
            case 11: System.out.print("November"); break;
            case 12: System.out.print("December"); break;
        }

        System.out.print(", " + year);
    }
}
