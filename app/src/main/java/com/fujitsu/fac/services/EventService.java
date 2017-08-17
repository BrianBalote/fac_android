package com.fujitsu.fac.services;

import com.fujitsu.fac.domain.Event;

/**
 * Created by b.balote on 8/9/2017.
 */

public class EventService {

    private Event currentEvent;

    private static EventService instance = null;

    private EventService() {
    }

    private EventService(boolean forTesting) {
        this.currentEvent = new Event(true);
    }

    public static EventService getInstance() {

        if(instance == null) {
            instance = new EventService(true);
        }

        return instance;
    }

    public Event getCurrentEvent() {
        return currentEvent;
    }

    public void setCurrentEvent(Event currentEvent) {
        this.currentEvent = currentEvent;
    }
}
