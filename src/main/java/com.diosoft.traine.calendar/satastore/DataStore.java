package com.diosoft.traine.calendar.satastore;

import com.diosoft.traine.calendar.common.Event;

import java.util.List;

public interface DataStore {

    void add(Event inputValue);

    List<Event> getEventsByTitle(String inputValue);
//    Map<UUID,Event>
//    Map<String, List<UUID>>
//    Map<Date, List<UUID>>


}
