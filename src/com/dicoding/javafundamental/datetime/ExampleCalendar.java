package com.dicoding.javafundamental.datetime;

import java.util.Calendar;

public class ExampleCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Tanggal saat ini adalah : " + calendar.getTime());
    }
}
