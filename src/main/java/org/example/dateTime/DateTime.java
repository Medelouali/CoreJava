package org.example.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTime {
    public static void run(){
        LocalDateTime localDateTime=LocalDateTime.of(2023, Month.APRIL, 23, 2, 2, 2);
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
    }
}
