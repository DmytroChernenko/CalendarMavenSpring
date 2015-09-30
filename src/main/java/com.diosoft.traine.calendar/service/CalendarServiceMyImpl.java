package com.diosoft.traine.calendar.service;

import com.diosoft.traine.calendar.common.Event;

import java.util.*;

/**
 * Created by Dmytro on 30.09.15.
 */
public class CalendarServiceMyImpl implements CalendarService{

    private HashMap<String, Event> eventsStore;

    @Override
    public void add(Event event) {
        eventsStore.put(event.getTitle(), event);
    }

    @Override
    public void remove(UUID id) {
        Iterator<Map.Entry<String, Event>> iterator = eventsStore.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Event> pair = iterator.next();
            Event event = pair.getValue();
            if(event.getId().equals(id))
                iterator.remove();
        }
    }

    @Override
    public void logInfo(UUID id) {

    }

    @Override
    public List<Event> searchByTitle(String title) {
        List<Event> result = new ArrayList<>();
        for (Event event : eventsStore.values()) {
            if(event.getTitle().equals(title))
                result.add(event);
        }

        return result;
    }

    @Override
    public List<Event> searchByDay(Date day) {
        List<Event> result = new ArrayList<>();
        for (Event event : eventsStore.values()) {
            if(event.getStartDate().equals(day))
                result.add(event);
        }

        return result;
    }
}
