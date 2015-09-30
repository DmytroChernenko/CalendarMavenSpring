package com.diosoft.traine.calendar;

import com.diosoft.traine.calendar.common.Event;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Dmytro on 30.09.15.
 */
public class Main {
    public static void main(String[] args) {

        List<String> emails = new ArrayList<>();
        emails.add("dmytro.chernenko@ex.ua");
        emails.add("1@ex.ua");
        emails.add("2@ex.ua");
        emails.add("3@ex.ua");
        emails.add("asdasd@ex.ua");

        Event event = new Event.Builder()
                .attenders(emails)
                .startDate(new Date())
                .build();

        System.out.println(event);
    }
}
